class Solution {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];
        int l, i, j, k;
        for (l = 2; l <= n; l++) {
            for (i = 1; i <= n - l + 1; i++) {
                j = i + l - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (k = i; k <= j; k++) {
                    dp[i][j] = Math.min(Math.max(k > 1 ? dp[i][k - 1] : 0, 
                                                 k < n ? dp[k + 1][j] : 0) + k, dp[i][j]);
                }
            }
        }
        return dp[1][n];
    }
}