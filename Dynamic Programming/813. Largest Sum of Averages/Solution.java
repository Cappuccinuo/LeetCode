class Solution {
    public double largestSumOfAverages(int[] A, int K) {
        int N = A.length;
        double[] sum = new double[N + 1];
        for (int i = 0; i < N; i++) {
            sum[i + 1] = sum[i] + A[i];
        }
        
        double[][] dp = new double[K][N];
        for (int k = 0; k < K; k++) {
            for (int i = 0; i < N; i++) {
                dp[k][i] = (k == 0) ? sum[i + 1] / (i + 1) : dp[k - 1][i];
                if (k > 0) {
                    for (int j = i - 1; j >= 0; j--) {
                        dp[k][i] = Math.max(dp[k][i], dp[k - 1][j] + (sum[i + 1] - sum[j + 1]) / (i - j));
                    }
                }
            }
        }
        return dp[K - 1][N - 1];
    }
}