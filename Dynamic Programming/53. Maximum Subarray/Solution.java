class Solution {
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum < 0) {
                sum = nums[i];
            }
            else {
                sum += nums[i];
            }
            if (sum > result) {
                result = sum;
            }
        }
        return result;
    }
}