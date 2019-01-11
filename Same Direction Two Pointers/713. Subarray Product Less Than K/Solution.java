class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int len = nums.length;
        int start = 0;
        int end = 0;
        int prod = 1;
        int ans = 0;
        while (end < len) {
            prod = prod * nums[end];
            while (start < len && prod >= k) {
                prod = prod / nums[start];
                start++;
            }
            ans += end - start + 1;
            end++;
        }
        return ans;
    }
}