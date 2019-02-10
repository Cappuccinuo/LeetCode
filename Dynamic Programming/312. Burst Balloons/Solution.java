class Solution {
    public int maxCoins(int[] nums) {
        int[] A = initArray(nums);
        int len = A.length;
        int[][] dp = new int[len][len];

        int l, i, j, k;
        for (i = 1; i < len - 1; i++) {
            dp[i][i] = A[i - 1] * A[i] * A[i + 1];
        }
        
        for (l = 3; l <= len; l++) {
            for (i = 0; i <= len - l; i++) {
                j = i + l - 1;
                for (k = i + 1; k < j; k++) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][k] + dp[k][j] + A[i] * A[k] * A[j]);
                }
            }
        }
        return dp[0][len - 1];
    }
    
    private int[] initArray(int[] nums) {
        int[] result = new int[nums.length + 2];
        result[0] = 1;
        result[result.length - 1] = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i + 1] = nums[i];
        }
        return result;
    }
}