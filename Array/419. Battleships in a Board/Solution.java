class Solution {
    public int countBattleships(char[][] board) {
        int rowSize = board.length;
        if (rowSize == 0) {
            return 0;
        }
        int columnSize = board[0].length;
        int count = 0;
        
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                if (board[i][j] == '.') { continue; }
                if (i > 0 && board[i - 1][j] == 'X') { continue; }
                if (j > 0 && board[i][j - 1] == 'X') { continue; }
                count++;
            }
        }
        return count;
    }
}