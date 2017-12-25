class Solution {
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        int rowLen = board.length;
        int colLen = board[0].length;
        visited = new boolean[rowLen][colLen];
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                if (word.charAt(0) == board[i][j] && existUtil(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean existUtil(char[][] board, String word, int row, int column, int index) {
        if (index == word.length()) {
            return true;
        }
        
        if (row < 0 || row >= board.length || column < 0 || column >= board[0].length ||
           word.charAt(index) != board[row][column] || visited[row][column]) {
            return false;
        }
        
        visited[row][column] = true;
        if (existUtil(board, word, row + 1, column, index + 1) ||
           existUtil(board, word, row, column + 1, index + 1) ||
           existUtil(board, word, row - 1, column, index + 1) ||
           existUtil(board, word, row, column - 1, index + 1)) {
            return true;
        }
        visited[row][column] = false;
        return false;
    }
}