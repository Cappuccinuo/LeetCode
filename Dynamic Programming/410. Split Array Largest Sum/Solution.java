class Solution {
    public int splitArray(int[] nums, int m) {
        int len = nums.length;
        int[] prefixSum = new int[len + 1];
        prefixSum[0] = 0;
        int i;
        for (i = 1; i <= len; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
        
        int[][] dp = new int[len + 1][m + 1];
        
        for (i = 0; i <= len; i++) {
            dp[i][1] = prefixSum[i];
        }
        int j, k;
        for (j = 2; j <= m; j++) {
            for (i = j; i <= len; i++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (k = j - 1; k < i; k++) {
                    dp[i][j] = Math.min(dp[i][j], Math.max(dp[k][j - 1], prefixSum[i] - prefixSum[k]));
                }
            }
        }
        
        return dp[len][m];
    }
}