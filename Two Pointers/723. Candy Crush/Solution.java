class Solution {
    int m;
    int n;
    
    public int[][] candyCrush(int[][] board) {
        m = board.length;
        n = board[0].length;
        int i, j, val;
        boolean shouldContinue = false;
        
        // Candy crush
        // Vertically
        for (i = 0; i < m - 2; i++) {
            for (j = 0; j < n; j++) {
                val = Math.abs(board[i][j]);
                if (val != 0 && val == Math.abs(board[i + 1][j]) && val == Math.abs(board[i + 2][j])) {
                    board[i][j] = board[i + 1][j] = board[i + 2][j] = -val;
                }
            }
        }
        
        // Horizontally
        for (i = 0; i < m; i++) {
            for (j = 0; j < n - 2; j++) {
                val = Math.abs(board[i][j]);
                if (val != 0 && val == Math.abs(board[i][j + 1]) && val == Math.abs(board[i][j + 2])) {
                    board[i][j] = board[i][j + 1] = board[i][j + 2] = -val;
                }
            }
        }
        
        // Drop Vertically
        for (j = 0; j < n; j++) {
            int validIndex = m - 1;
            for (i = m - 1; i >= 0; i--) {
                if (board[i][j] >= 0) {
                    board[validIndex--][j] = board[i][j];
                }
            }
            for (i = validIndex; i >= 0; i--) {
                board[i][j] = 0;
                shouldContinue = true;
            }
        }
        
        
        return shouldContinue ? candyCrush(board) : board;
    }
}