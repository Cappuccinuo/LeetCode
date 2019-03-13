class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int i;
        int len = houses.length;
        int N = heaters.length;
        int max = 0;
        for (i = 0; i < len; i++) {
            int index = binarySearch(houses[i], heaters);

            if (index == N) {
                max = Math.max(max, houses[i] - heaters[N - 1]);
            }
            else {
                max = Math.max(max, Math.min(Math.abs(index > 0 ? houses[i] - heaters[index - 1] : Integer.MAX_VALUE), 
                                             Math.abs(houses[i] - heaters[index])));
            }
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