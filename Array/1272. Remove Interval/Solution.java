class Solution {
    public List<List<Integer>> removeInterval(int[][] intervals, int[] toBeRemoved) {
        List<List<Integer>> result = new LinkedList<>();
        int min = toBeRemoved[0];
        int max = toBeRemoved[1];
        
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            
            if (end < min || start > max) {
                result.add(Arrays.asList(start, end));
            }
            else {
                if (start < min) {
                    result.add(Arrays.asList(start, min));
                }
                if (end > max) {
                    result.add(Arrays.asList(max, end));
                }
            }
        }
        
        return result;
    }
}