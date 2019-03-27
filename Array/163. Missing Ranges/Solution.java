class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new LinkedList<>();

        int i;
        int len = nums.length;
        long start = (long)lower - 1;
        
        for (i = 0; i < len; i++) {
            if (nums[i] == start + 1) {
                start = nums[i];
            }
            else {
                long left = Math.min(upper, start + 1);
                long right = Math.min(upper, (long)nums[i] - 1);
                if (left == right) {
                    result.add(left + "");
                }
                else if (left > right) {
                    start = nums[i];
                    continue;
                }
                else {
                    result.add(left + "->" + right);
                }
                start = nums[i];
            }   
        }
        
        if (start < upper) {
            if (start + 1 == upper) {
                result.add(upper + "");
            }
            else {
                result.add((start + 1) + "->" + upper);
            }
        }
        
        return result;
    }
}