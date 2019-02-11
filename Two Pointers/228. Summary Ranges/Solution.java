class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new LinkedList<>();
        int len = nums.length;
        int i, j;
        for (i = 0, j = 0; j < len; j++) {
            if (j + 1 < len && nums[j] + 1 == nums[j + 1]) {
                continue;
            }
            if (i == j) {
                result.add(String.valueOf(nums[i]));
            }
            else {
                result.add(String.valueOf(nums[i]) + "->" + String.valueOf(nums[j]));
            }
            i = j + 1;
        }
        return result;
    }
}