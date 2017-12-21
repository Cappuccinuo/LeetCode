class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (obstacleGrid[m - 1][n - 1] == 1) {
            return 0;
        }
        if (m == 1 && n == 1) {
            return 1;
        }

        int[][] dp = new int[m][n];
        for (int i = m - 2; i >= 0; i--) {
            if (obstacleGrid[i][n - 1] != 1) {
                dp[i][n - 1] = 1;
            }
            else {
                break;
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (obstacleGrid[m - 1][i] != 1) {
                dp[m - 1][i] = 1;
            }
            else {
                break;
            }
        }
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                }
                else {
                    dp[i][j] = dp[i + 1][j] + dp[i][j + 1];
                }
            }
        }
        return dp[0][0];
    }
}