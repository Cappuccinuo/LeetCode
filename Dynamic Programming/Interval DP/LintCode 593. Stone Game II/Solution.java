// Expand the array [4, 1, 1, 4] -> [4, 1, 1, 4, 4, 1, 1, 4]
public class Solution {
    /**
     * @param A: An integer array
     * @return: An integer
     */
    public int stoneGame2(int[] A) {
        // write your code here
        if (A == null || A.length == 0) {
            return 0;
        }
        int n = A.length;
        int[] prefixSum = new int[2 * n + 1];
        for (int i = 1; i <= 2 * n; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[(i - 1) % n];
        }
        
        int[][] dp = new int[2 * n][2 * n];
        
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= 2 * n - len; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    dp[i][j] = Math.min(dp[i][j], 
                            dp[i][k] + dp[k + 1][j] + prefixSum[j + 1] - prefixSum[i]);
                }
            }
        }
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(dp[i][i + n - 1], min);
        }
        return min;
    }
}