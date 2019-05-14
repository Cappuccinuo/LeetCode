class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int minimum = 0;
        int N = costs.length;
        int i;
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
           public int compare(int[] a, int[] b) {
               return a[0] - a[1] - (b[0] - b[1]);
           } 
        });
        
        for (i = 0; i < N / 2; i++) {
            minimum += costs[i][0] + costs[i + N / 2][1];
        }
        return minimum;
    }
}