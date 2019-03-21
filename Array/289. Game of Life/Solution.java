class Solution {
    int[][] directions = new int[][]{{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};
    
    public void gameOfLife(int[][] board) {
        int row = board.length;
        int col = board[0].length;
        int i, j;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                int count = 0;
                for (int[] direction : directions) {
                    int x = i + direction[0];
                    int y = j + direction[1];
                    if (!inBound(x, y, row, col)) {
                        continue;
                    }
                    if (board[x][y] == 1 || board[x][y] == 2) {
                        count++;
                    }
                }
                if (board[i][j] == 0 && count == 3) {
                    board[i][j] = 3;
                }
                else if (board[i][j] == 1 && (count < 2 || count > 3)) {
                    board[i][j] = 2;
                }
            }
        }
        
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (board[i][j] == 2) {
                    board[i][j] = 0;
                }
                else if (board[i][j] == 3) {
                    board[i][j] = 1;
                }
            }
        }
    }
    
    private boolean inBound(int i, int j, int row, int col) {
        return i >= 0 && i < row && j >= 0 && j < col;
    }
}