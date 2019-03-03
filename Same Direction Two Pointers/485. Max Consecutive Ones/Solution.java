class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int start = 0;
        int end = 0;
        int max = 0;
        int len = nums.length;
        while (end < len) {
            int num = nums[end];
            end++;
            if (num != 0) {
                max = Math.max(max, end - start);
            }
            else {
                start = end;
            }
        }
        return max;
    }
}

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int current = 0;
        for (int num : nums) {
            if (num != 0) {
                current++;
                result = Math.max(result, current);
            }
            else {
                current = 0;
            }
        }
        return result;
    }
}