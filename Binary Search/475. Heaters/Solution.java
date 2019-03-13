class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int i;
        int houseLen = houses.length;
        int heaterLen = heaters.length;
        int max = 0;
        
        for (i = 0; i < houseLen; i++) {
            int index = binarySearch(houses[i], heaters);

            int leftDist = index > 0 ? Math.abs(houses[i] - heaters[index - 1]) : 
                                       Integer.MAX_VALUE;
            int rightDist = index < heaterLen ? Math.abs(houses[i] - heaters[index]) : 
                                                Math.abs(houses[i] - heaters[heaterLen - 1]);
            
            max = Math.max(Math.min(leftDist, rightDist), max);
        }
        
        return max;
    }
    
    private int binarySearch(int house, int[] heaters) {
        int len = heaters.length;
        int start = 0;
        int end = len - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (heaters[mid] >= house) {
                end = mid;
            }
            else {
                start = mid;
            }
        }
        
        if (heaters[start] >= house) {
            return start;
        }
        if (heaters[end] >= house) {
            return end;
        }
        return len;
    }
}