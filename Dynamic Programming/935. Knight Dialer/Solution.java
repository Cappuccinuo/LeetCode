class Solution {
    public static final int MOD = 1000000007;
    public int knightDialer(int N) {
        int[][] board = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {-1, 0, -1}};
        int[][] directions = new int[][]{{-2, 1}, {2, 1}, {1, 2}, {1, -2}, {-1, 2}, {-1, -2}, {-2, -1}, {2, -1}};
        int m = board.length;
        int n = board[0].length;
        int[][] dp = new int[m][n];
        int i, j, k, l;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (board[i][j] != -1) {
                    dp[i][j] = 1;
                }
            }
        }

        for (k = 2; k <= N; k++) {
            int[][] dp2 = new int[m][n];
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    if (board[i][j] != -1) {
                        long val = 0;
                        for (l = 0; l < 8; l++) {
                            int[] direction = directions[l];
                            int x = i + direction[0];
                            int y = j + direction[1];
                            if (x >= 0 && x < m && y >= 0 && y < n && board[x][y] != -1) {
                                val += dp[x][y];
                            }
                        }
                        dp2[i][j] = (int)(val % MOD);
                    }
                }
            }
            dp = dp2;
        }
        
        int ans = 0;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                ans = (ans + dp[i][j]) % MOD;
            }
        }
        return ans;
    }
}