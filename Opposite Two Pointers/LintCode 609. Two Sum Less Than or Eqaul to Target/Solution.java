public class Solution {
    /**
     * @param nums: an array of integer
     * @param target: an integer
     * @return: an integer
     */
    public int twoSum5(int[] nums, int target) {
        // write your code here
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        int result = 0;
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum > target) {
                end--;
            }
            else {
                result += end - start;
                start++;
            }
        }
        return result;
    }
}