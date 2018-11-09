public class Solution {
    /*
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(List<Integer> nums) {
        // write your code here
        if (nums == null || nums.size() == 0) {
            return 0;
        } 
        int min = nums.get(0);
        int sum = 0;
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            sum += nums.get(i);
            min = Math.min(min, sum);
            sum = Math.min(sum, 0);
        }
        return min;
    }
}