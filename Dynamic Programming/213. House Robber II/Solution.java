class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        return Math.max(robFrom(nums, 0, n - 2), robFrom(nums, 1, n - 1));
    }
    
    public int robFrom(int[] nums, int lo, int hi) {
        int currMax = 0;
        int prevMax = 0;
        for (int i = lo; i <= hi; i++) {
            int temp = currMax;
            currMax = Math.max(currMax, prevMax + nums[i]);
            prevMax = temp;
        }
        return currMax;
    }
}