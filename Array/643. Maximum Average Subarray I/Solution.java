class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum / k;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double result = Integer.MIN_VALUE;
        int n = nums.length;
        double[] prefixSum = new double[n + 1];
        prefixSum[0] = 0;
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
        
        for (int i = k; i <= n; i++) {
            double currentSum = prefixSum[i] - prefixSum[i - k];
            double currentAverage = currentSum / k;
            result = Math.max(result, currentAverage);
        }
        return result == Integer.MIN_VALUE ? 0 : result;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)