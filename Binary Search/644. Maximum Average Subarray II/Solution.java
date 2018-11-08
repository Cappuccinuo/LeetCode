public class Solution {
    /**
     * @param nums: an array with positive and negative numbers
     * @param k: an integer
     * @return: the maximum average
     */
    public double maxAverage(int[] nums, int k) {
        // write your code here
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        
        double start = min;
        double end = max;
        
        while (end - start > 1e-6) {
            double mid = start + (end - start) / 2;
            if (hasSubarray(nums, mid, k)) {
                start = mid;
            }
            else {
                end = mid;
            }
        }
        
        return start;
    }
    
    private boolean hasSubarray(int[] nums, double average, int k) {
        int n = nums.length;
        double[] prefixSum = new double[n + 1];
        prefixSum[0] = 0;
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1] - average;
        }
        
        double minPrefixSum = 0;
        for (int i = k; i <= n; i++) {
            if (prefixSum[i] - minPrefixSum >= 0) {
                return true;
            }
            minPrefixSum = Math.min(minPrefixSum, prefixSum[i - k + 1]);
        }
        
        return false;
    }
}