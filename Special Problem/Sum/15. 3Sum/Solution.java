class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int numsLen = nums.length;
        List<List<Integer>> result = new LinkedList<>();
        
        for (int i = 0; i < numsLen - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int lo = i + 1;
                int hi = numsLen - 1;
                int needSum = 0 - nums[i];
                twoSum(nums, i, lo, hi, needSum, result);
            }
        }
        
        return result;
    }
    
    public void twoSum (int[] nums, int currentIndex, int lo, int hi, int needSum, List<List<Integer>> result) {
        while (lo < hi) {
            int currentSum = nums[lo] + nums[hi];
            if (currentSum == needSum) {
                result.add(Arrays.asList(nums[currentIndex], nums[lo], nums[hi]));
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