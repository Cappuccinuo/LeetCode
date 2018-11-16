class Solution {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int[] result = new int[3];
        int len = nums.length;
        int[] sum = new int[len];
        sum[0] = nums[0];
        for (int i = 1; i < len; i++) {
            sum[i] = sum[i - 1] + nums[i];
            if (i >= k) {
                sum[i] -= nums[i - k];
            }
        }
        
        int[] left = new int[len];
        int leftMaxIndex = k - 1;
        for (int i = k - 1; i < len; i++) {
            leftMaxIndex = sum[i] > sum[leftMaxIndex] ? i : leftMaxIndex;
            left[i] = leftMaxIndex;
        }
        
        int[] right = new int[len];
        int rightMaxIndex = len - 1;
        for (int i = len - 1; i >= k - 1; i--) {
            rightMaxIndex = sum[i] > sum[rightMaxIndex] ? i : rightMaxIndex;
            right[i] = rightMaxIndex;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 2 * k - 1; i < len - k; i++) {
            int currentSum = sum[left[i - k]] + sum[i] + sum[right[i + k]];
            if (currentSum > max) {
                max = currentSum;
                result[0] = left[i - k] - k + 1;
                result[1] = i - k + 1;
                result[2] = right[i + k] - k + 1;
            }
        }
        
        return result;
    }
}