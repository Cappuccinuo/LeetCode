class Solution {
    private final int[][] directions = new int[][]{{-1, 1}, {1, -1}};
    
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m * n];
        int index = 0;
        int d = 0;
        int i = 0;
        int j = 0;
        while (index < m * n) {
            result[index++] = matrix[i][j];

            int[] direction = directions[d];
            i = i + direction[0];
            j = j + direction[1];
            if (!inBound(i, j, m, n)) {
                d = 1 - d;
            }
            
            if (i >= m) {
                j = j + 2;
                i = m - 1;
            }
            if (j >= n) {
                i = i + 2;
                j = n - 1;
            }
            
            if (i < 0) {
                i = 0;
            }
            if (j < 0) {
                j = 0;
            }
        }
        return result;
    }
    
    private boolean inBound(int i, int j, int m, int n) {
        return i >= 0 && j >= 0 && i < m && j < n;
    }
}