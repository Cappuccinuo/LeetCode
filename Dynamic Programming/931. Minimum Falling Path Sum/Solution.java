class Solution {
    public int minFallingPathSum(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        int[][] dp = new int[m][n];
        
        for (int j = 0; j < n; j++) {
            dp[0][j] = A[0][j];
        }
        
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = Math.min(j > 0 ? dp[i - 1][j - 1] : Integer.MAX_VALUE, 
                                   Math.min(j + 1 < n ? dp[i - 1][j + 1] : Integer.MAX_VALUE, 
                                           dp[i - 1][j])) + A[i][j];
            }
        }
        
        int res = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            res = Math.min(res, dp[m - 1][j]);
        }
        
        return res;
    }
}