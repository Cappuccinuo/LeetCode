class Solution {
    public int projectionArea(int[][] grid) {
        int N = grid.length;
        int ans = 0;
        
        for (int i = 0; i < N; i++) {
            int bestRow = 0;
            int bestCol = 0;
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > 0) {
                    ans++;
                }
                bestRow = Math.max(bestRow, grid[i][j]);
                bestCol = Math.max(bestCol, grid[j][i]);
            }
            ans += bestRow + bestCol;
        }
        
        return ans;
    }
}