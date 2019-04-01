class Solution {
    public int findLength(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        int[][] dp = new int[2][n + 1];
        int max = 0;
        int i, j;
        for (i = 0; i <= m; i++) {
            for (j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i % 2][j] = 0;
                }
                else if (A[i - 1] == B[j - 1]) {
                    dp[i % 2][j] = dp[(i - 1) % 2][j - 1] + 1;
                    max = Math.max(max, dp[i % 2][j]);
                }
                else {
                    dp[i % 2][j] = 0;
                }
            }
        }
        return max;
    }
}