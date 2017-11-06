public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double result = Integer.MIN_VALUE;
	int sum = 0;
	for (int i = 0; i < k; i++) {
	     sum += nums[i];
	}
	result = Math.max(result, sum * 1.0 / k);
	for (int i = k; i < nums.length; i++) {
	     sum += nums[i] - nums[i - k];
	     result = Math.max(result, sum * 1.0 / k);
	}
	return result;
    }
}
