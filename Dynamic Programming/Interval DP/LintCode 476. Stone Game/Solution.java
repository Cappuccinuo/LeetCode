// 先循环区间长度，再循环起点位置
public class Solution {
    /**
     * @param A: An integer array
     * @return: An integer
     */
    public int stoneGame(int[] A) {
        // write your code here
        if (A == null || A.length == 0) {
            return 0;
        }
        int n = A.length;
        int[] prefixSum = new int[n + 1];
        prefixSum[0] = 0;
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = A[i - 1] + prefixSum[i - 1];
        }
        
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = 0;
        }
        
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int sum = prefixSum[j + 1] - prefixSum[i];
                    dp[i][j] = Math.min(sum + dp[i][k] + dp[k + 1][j], dp[i][j]);
                }
            }
        }
        return dp[0][n - 1];
    }
}

// 起点倒过来循环， 终点正过去循环
public class Solution {
    /**
     * @param A: An integer array
     * @return: An integer
     */
    public int stoneGame(int[] A) {
        // write your code here
        if (A == null || A.length == 0) {
            return 0;
        }
        int n = A.length;
        int[] prefixSum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i - 1];
        }
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    dp[i][j] = Math.min(dp[i][j], 
                    dp[i][k] + dp[k + 1][j] + prefixSum[j + 1] - prefixSum[i]);
                }
            }
        }
        return dp[0][n - 1];
    }
}

// 记忆化搜索
public class Solution {
    /**
     * @param A: An integer array
     * @return: An integer
     */
    public int stoneGame(int[] A) {
        // write your code here
        if (A == null || A.length == 0) {
            return 0;
        }
        int n = A.length;
        int[] prefixSum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i - 1];
        }
        int[][] dp = new int[n][n];
        maxHelper(prefixSum, dp, 0, n - 1);
        return dp[0][n - 1];
    }
    
    private int maxHelper(int[] prefixSum, int[][] dp, int i, int j) {
        if (i == j) {
            return 0;
        }
        
        if (dp[i][j] != 0) {
            return dp[i][j];
        }
        int score = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int left = maxHelper(prefixSum, dp, i, k);
            int right = maxHelper(prefixSum, dp, k + 1, j);
            score = Math.min(score, left + right + prefixSum[j + 1] - prefixSum[i]);
        }
        dp[i][j] = score;
        return score;
    }
}