class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        int numsLen = nums.length;
        for (int i = 0; i < numsLen - 3; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int needSum = target - nums[i];
                int startIndex = i + 1;
                threeSum(nums, startIndex, needSum, result);
            }
        }
        return result;
    }
    
    public void threeSum(int[] nums, int startIndex, int target, List<List<Integer>> result) {
        int numsLen = nums.length;
        for (int i = startIndex; i < numsLen - 2; i++) {
            if (i == startIndex || (i > startIndex && nums[i] != nums[i - 1])) {
                int needSum = target - nums[i];
                int lo = i + 1;
                int hi = numsLen - 1;
                while (lo < hi) {
                    int currentSum = nums[lo] + nums[hi];
                    if (currentSum == needSum) {
                        result.add(Arrays.asList(nums[startIndex - 1], nums[i], nums[lo], nums[hi]));
                        while (lo < hi && nums[lo] == nums[lo + 1]) { lo++; }
                        while (lo < hi && nums[hi] == nums[hi - 1]) { hi--; }
                        lo++;
                        hi--;
                    }
                    else {
                        if (currentSum < needSum) { lo++; }
                        else { hi--; }
                    }
                }
            }
        }
    }
}