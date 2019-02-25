class Solution {
    public int combinationSum4(int[] nums, int target) {
        int len = nums.length;
        int[] dp = new int[target + 1];
        int i, j;
        
        // For last step, [1,2,3] target = 4
        // target = 4, for 1, we need to know how many ways to form 3
        // for 2, we need to know how many ways to form 2
        // for 3, we need to know how many ways to form 1
        dp[0] = 1;
        for (i = 1; i <= target; i++) {
            for (j = 0; j < len; j++) {
                if (i >= nums[j]) {
                    dp[i] += dp[i - nums[j]];
                }
            }
        }
        return dp[target];
    }
}