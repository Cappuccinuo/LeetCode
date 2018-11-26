class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int count = 0;
        int len = nums.length;
        for (int i = 0; i < len - 2; i++) {
            count += twoSumHelper(nums, i + 1, target - nums[i]);
        }
        return count;
    }
    
    private int twoSumHelper(int[] nums, int index, int limit) {
        int start = index;
        int end = nums.length - 1;
        int count = 0;
        
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum < limit) {
                count += end - start;
                start++;
            }
            else {
                end--;
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