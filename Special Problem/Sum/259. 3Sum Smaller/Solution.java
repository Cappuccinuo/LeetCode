class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int numsLen = nums.length;
        int count = 0;
        for (int i = 0; i < numsLen - 2; i++) {
            int maxSum = target - nums[i];
            int lo = i + 1;
            int hi = numsLen - 1;
            while (lo < hi) {
                int currentSum = nums[lo] + nums[hi];
                if (currentSum < maxSum) {
                    count += hi - lo;
                    lo++;
                }
                else {
                    hi--;
                }
            }
        }
        return count;
    }
}