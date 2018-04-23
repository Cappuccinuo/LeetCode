class Solution {
    int m;
    int n;
    public void rotate(int[][] matrix) {
        m = matrix.length;
        n = matrix[0].length;
        if (matrix == null || m == 0 || n == 0) {
            return;
        }
        transpose(matrix);
        rotateColumn(matrix);
    }
    
    private void rotateColumn(int[][] matrix) {
        for (int i = 0; i < m; i++) {
            int start = 0;
            int end = n - 1;
            while (start < end) {
                swap(matrix, i, start, i, end);
                start++;
                end--;
            }
        }
    }
    
    private void transpose(int[][] matrix) {
        for (int i = 0; i < m; i++) {
            for (int j = i; j < n; j++) {
                swap(matrix, i, j, j, i);
            }
        }
    }
    
    private void swap(int[][] matrix, int i, int j, int x, int y) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[x][y];
        matrix[x][y] = temp;
    }
}