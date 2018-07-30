class Solution {
    public boolean stoneGame(int[] piles) {
        int N = piles.length;
        int[][] dp = new int[N][N];
        
        for (int p = 0; p < N; p++) {
            dp[p][p] = piles[p];
        }
        
        for (int d = 1; d < N; d++) {
            for (int i = 0; i + d < N; i++) {
                dp[i][i + d] = Math.max(piles[i] - dp[i + 1][i + d], piles[i + d] - dp[i][i + d - 1]);
            }
        }
        
        return dp[0][N - 1] > 0;
    }
}

class Solution {
    public boolean stoneGame(int[] piles) {
        return true;
    }
}