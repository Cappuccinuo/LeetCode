class Solution {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int i, j;
        int[][] dp = new int[row][col];
        int res = 0;
        
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (matrix[i][j] == '0') {
                    continue;
                }
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                    res = Math.max(res, dp[i][j]);
                    continue;
                }
                int up = dp[i - 1][j];
                int left = dp[i][j - 1];
                int diag = dp[i - 1][j - 1];
                dp[i][j] = Math.min(Math.min(up, left), diag) + 1;
                res = Math.max(res, dp[i][j]);
            }
        }
        return res * res;
    }
}

public class Solution {
    /**
     * @param matrix: a matrix of 0 and 1
     * @return: an integer
     */
    public int maxSquare(int[][] matrix) {
        // write your code here
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int result = 0;
        for (int i = 0; i < m; i++) {
            dp[i][0] = matrix[i][0];
            result = Math.max(dp[i][0], result);
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = matrix[0][j];
            result = Math.max(dp[0][j], result);
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 1) {
                    dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i - 1][j - 1], dp[i][j - 1])) + 1;
                }
                else {
                    dp[i][j] = 0;
                }
                result = Math.max(dp[i][j], result);
            }
        }
        
        return result * result;
    }
}

// Increasing stack
public class Solution {
    /**
     * @param matrix: a matrix of 0 and 1
     * @return: an integer
     */
    public int maxSquare(int[][] matrix) {
        // write your code here
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] map = new int[m][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    map[i][j] = 0;
                }
                else {
                    map[i][j] = i == 0 ? matrix[i][j] : map[i - 1][j] + matrix[i][j];
                }
            }
        }
        int result = 0;
        for (int[] row : map) {
            int rowArea = getRowArea(row);
            result = Math.max(rowArea, result);
        }
        return result;
    }
    
    private int getRowArea(int[] row) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (int i = 0; i < row.length; i++) {
            int current = i == row.length ? Integer.MIN_VALUE : row[i];
            while (!stack.isEmpty() && row[stack.peek()] > current) {
                int top = stack.pop();
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                int length = row[top];
                int sideLen = Math.min(width, length);
                int currentArea = sideLen * sideLen;
                res = Math.max(res, currentArea);
            }
            stack.push(i);
        }
        
        return res;
    }
}