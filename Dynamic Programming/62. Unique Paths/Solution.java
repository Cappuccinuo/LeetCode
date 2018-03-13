class Solution {
    public int uniquePaths(int m, int n) {
        if (m == 1 && n == 1) {
            return 1;
        }
        int[][] dp = new int[m][n];
        for (int i = 0; i < m - 1; i++) {
            dp[i][n - 1] = 1;
        }
        for (int i = 0; i < n - 1; i++) {
            dp[m - 1][i] = 1;
        }
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                dp[i][j] = dp[i + 1][j] + dp[i][j + 1];
            }
        }
        return dp[0][0];
    }
}

class Solution {
    public int uniquePaths(int m, int n) {
        int pos = m + n - 2;
        int k = m - 1;
        double result = 1;
        for (int i = 1; i <= k; i++) {
            result = result * (pos - k + i) / i;
        }
        return (int)result;
    }
}