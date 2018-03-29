// 2018.3.29
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return -1;
        }
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
                if (sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        
        return result;
    }
}







class Solution {
    public int threeSumClosest(int[] nums, int target) {
        long closestSum = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int numsLen = nums.length;
        
        for (int i = 0; i < numsLen - 2; i++) {
            int lo = i + 1;
            int hi = numsLen - 1;
            while (lo < hi) {
                int currentSum = nums[lo] + nums[hi] + nums[i];
                if (currentSum == target) {
                    return target;
                }
                long closestDiff = Math.abs(closestSum - target);
                int currentDiff = Math.abs(currentSum - target);
                if (currentDiff < closestDiff) {
                    closestSum = currentSum;
                }
                if (currentSum < target) {
                    lo++;
                }
                else {
                    hi--;
                }
            }
        }
        return (int)closestSum;
    }
}