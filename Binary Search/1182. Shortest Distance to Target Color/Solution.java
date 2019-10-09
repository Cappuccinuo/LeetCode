class Solution {
    public List<Integer> shortestDistanceColor(int[] colors, int[][] queries) {
        List<Integer> result = new LinkedList<>();
        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();
        List<Integer> three = new ArrayList<>();
        
        int i;
        for (i = 0; i < colors.length; i++) {
            if (colors[i] == 1) {
                one.add(i);
            }
            else if (colors[i] == 2) {
                two.add(i);
            }
            else {
                three.add(i);
            }
        }
        
        for (int[] query : queries) {
            result.add(search(query[1] == 1 ? one : (query[1] == 2 ? two : three), query[0]));
        }
        
        return result;
    }
    
    private int search(List<Integer> array, int index) {
        if (array.size() == 0) {
            return -1;
        }
        int start = 0;
        int end = array.size() - 1;
        
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (array.get(mid) < index) {
                start = mid;
            }
            else {
                end = mid;
            }
        }
        
        if (Math.abs(array.get(start) - index) < Math.abs(array.get(end) - index)) {
            return Math.abs(index - array.get(start));
        }
        return Math.abs(index - array.get(end));
    }
}