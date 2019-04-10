class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        int i, j;
        dp[1] = 1;
        for (i = 2; i <= n; i++) {
            for (j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(dp[j], j) * Math.max(dp[i - j], i - j));
            }
        }
        return dp[n];
    }
}