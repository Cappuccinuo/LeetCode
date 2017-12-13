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