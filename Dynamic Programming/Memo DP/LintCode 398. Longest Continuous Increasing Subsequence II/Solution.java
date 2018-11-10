public class Solution {
    /**
     * @param matrix: A 2D-array of integers
     * @return: an integer
     */
    public int longestContinuousIncreasingSubsequence2(int[][] matrix) {
        // write your code here
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int longest = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                longest = Math.max(longest, DFS(matrix, i, j, dp));
            }
        }
        return longest;
    }
    
    private int DFS(int[][] matrix, int i, int j, int[][] dp) {
        if (dp[i][j] != 0) {
            return dp[i][j];
        }
        
        int longest = 1;
        int[] deltaX = new int[]{0, 0, 1, -1};
        int[] deltaY = new int[]{1, -1, 0, 0};
        for (int k = 0; k < 4; k++) {
            int new_i = i + deltaX[k];
            int new_j = j + deltaY[k];
            if (!inBound(matrix.length, matrix[0].length, new_i, new_j) || matrix[new_i][new_j] <= matrix[i][j]) {
                continue;
            }
            longest = Math.max(longest, DFS(matrix, new_i, new_j, dp) + 1);
        }
        
        dp[i][j] = longest;
        return longest;
    }
    
    private boolean inBound(int m, int n, int i, int j) {
        return i < m && i >= 0 && j < n && j >= 0;
    }
}