// 2018.5.25
class Solution {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0) {
            return false;
        }
        if (word.length() == 0) {
            return true;
        }
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean result = find(board, i, j, 0, word);
                    if (result) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    private boolean find(char[][] board, int i, int j, int index, String word) {
        if (index == word.length()) {
            return true;
        }
        
        if (!inBound(board, i, j) || board[i][j] != word.charAt(index)) {
            return false;
        }
        
        board[i][j] = '#';
        boolean result = find(board, i - 1, j, index + 1, word)
            || find(board, i + 1, j, index + 1, word)
            || find(board, i, j - 1, index + 1, word) 
            || find(board, i, j + 1, index + 1, word);
        board[i][j] = word.charAt(index);
        return result;
    }
    
    private boolean inBound(char[][] board, int i, int j) {
        return i >= 0 && i < board.length && j >= 0 && j < board[0].length;
    }
}



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