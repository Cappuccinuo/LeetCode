class Solution {
    int[] dx = new int[]{0, 0, -1, 1};
    int[] dy = new int[]{1, -1, 0, 0};
    int row;
    int col;
    
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        row = matrix.length;
        col = matrix[0].length;
        int[][] memo = new int[row][col];
        int longest = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                longest = Math.max(longest, DFS(matrix, memo, i, j));
            }
        }
        return longest;
    }
    
    private int DFS(int[][] matrix, int[][] memo, int i, int j) {
        if (memo[i][j] != 0) {
            return memo[i][j];
        }
        int val = matrix[i][j];
        for (int d = 0; d < 4; d++) {
            int new_i = i + dx[d];
            int new_j = j + dy[d];
            if (inBound(new_i, new_j) && matrix[new_i][new_j] > val) {
                memo[i][j] = Math.max(memo[i][j], DFS(matrix, memo, new_i, new_j));
            }
        }
        memo[i][j]++;
        return memo[i][j];
    }
    
    private boolean inBound(int i, int j) {
        return i >= 0 && i < row && j >= 0 && j < col;
    }
}