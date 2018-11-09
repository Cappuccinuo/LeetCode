class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        Pair[][] moves = new Pair[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                moves[i][j] = new Pair(-1, -1);
            }
        }
        for (int i = 0; i < n; i++) {
            moves[i][i] = new Pair(piles[i], 0);
        }
        
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (piles[i] + moves[i + 1][j].second > moves[i][j - 1].second + piles[j]) {
                    moves[i][j].first = piles[i] + moves[i + 1][j].second;
                    moves[i][j].second = moves[i + 1][j].first;
                }
                else {
                    moves[i][j].first = piles[j] + moves[i][j - 1].second;
                    moves[i][j].second = moves[i][j - 1].first;
                }
            }
        }
        return moves[0][n - 1].first > moves[0][n - 1].second;
    }
    
    class Pair {
        int first;
        int second;
        Pair (int f, int s) {
            this.first = f;
            this.second = s;
        }
    }
}

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