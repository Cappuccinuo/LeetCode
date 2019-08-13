class Solution {
    public int numRollsToTarget(int d, int f, int target) {
        int mod = 1000000007;
        int[][] dp = new int[d + 1][target + 1];
        dp[0][0] = 1;
        
        int i, j, k;
        for (i = 1; i <= d; i++) {
            for (j = 1; j <= target; j++) {
                for (k = 1; k <= j && k <= f; k++) {
                    dp[i][j] = (dp[i - 1][j - k] + dp[i][j]) % mod;
                }
            }
        }
        
        return dp[d][target];
    }
}