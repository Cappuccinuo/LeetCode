class Solution {
    public int longestLine(int[][] M) {
        if (M == null || M.length == 0 || M[0].length == 0) {
            return 0;
        }
        int m = M.length;
        int n = M[0].length;
        
        int[][][] dp = new int[m + 1][n + 1][4];
        
        int i, j;
        int res = 0;
        
        for (i = 1; i <= m; i++) {
            for (j = 1; j <= n; j++) {
                if (M[i - 1][j - 1] == 1) {
                    dp[i][j][0] = dp[i][j - 1][0] + 1;
                    dp[i][j][1] = dp[i - 1][j][1] + 1;
                    dp[i][j][2] = dp[i - 1][j - 1][2] + 1;
                    dp[i][j][3] = j < n ? dp[i - 1][j + 1][3] + 1 : 0;
                    int temp = Math.max(dp[i][j][0], dp[i][j][1]);
                    temp = Math.max(temp, dp[i][j][2]);
                    temp = Math.max(temp, dp[i][j][3]);
                    res = Math.max(res, temp);
                }
            }
        }
        return res;
    }
}

class Solution {
    public int longestLine(int[][] M) {
        if (M == null || M.length == 0 || M[0].length == 0) {
            return 0;
        }
        int m = M.length;
        int n = M[0].length;
        
        int[][][] dp = new int[2][n + 1][4];
        
        int i, j;
        int res = 0;
        
        for (i = 1; i <= m; i++) {
            for (j = 1; j <= n; j++) {
                // Important
                Arrays.fill(dp[i % 2][j], 0);
                if (M[i - 1][j - 1] == 1) {
                    dp[i % 2][j][0] = dp[i % 2][j - 1][0] + 1;
                    dp[i % 2][j][1] = dp[(i - 1) % 2][j][1] + 1;
                    dp[i % 2][j][2] = dp[(i - 1) % 2][j - 1][2] + 1;
                    dp[i % 2][j][3] = j < n ? dp[(i - 1) % 2][j + 1][3] + 1 : 0;
                    int temp = Math.max(dp[i % 2][j][0], dp[i % 2][j][1]);
                    temp = Math.max(temp, dp[i % 2][j][2]);
                    temp = Math.max(temp, dp[i % 2][j][3]);
                    res = Math.max(res, temp);
                }
            }
        }

        return res;
    }
}