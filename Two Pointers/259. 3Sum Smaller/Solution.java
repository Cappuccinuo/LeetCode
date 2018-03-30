// 2018.3.29
class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return 0;
        }
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                if (sum < target) {
                    count += right - left;
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return count;
    }
}




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