class Solution {
    public int minMoves(int[] nums) {
        int[] dp = new int[nums.length + 1];
        Arrays.sort(nums);
        int smallest = nums[0];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= nums.length; i++) {
            dp[i] = nums[i - 1] - smallest + dp[i - 1];
        }
        return dp[nums.length];
    }
}