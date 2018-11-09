public class Solution {
    /**
     * @param values: a vector of integers
     * @return: a boolean which equals to true if the first player will win
     */
    public boolean firstWillWin(int[] values) {
        // write your code here
        if (values == null || values.length == 0) {
            return false;
        }
        if (values.length <= 2) {
            return true;
        }
        int n = values.length;
        int[] sum = new int[n];
        sum[n - 1] = values[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sum[i] = sum[i + 1] + values[i];
        }
        int[] dp = new int[n];
        dp[n - 1] = sum[n - 1];
        dp[n - 2] = sum[n - 2];
        
        for (int i = n - 3; i >= 0; i--) {
            dp[i] = Math.max(sum[i] - dp[i + 1], sum[i] - dp[i + 2]);
        }
        
        return dp[0] > sum[0] - dp[0];
    }
}