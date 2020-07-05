class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    dp[i][j] = matrix[i][j] - '0';
                } else if (matrix[i][j] == '0') {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + (matrix[i][j] - '0');
                }
            }
        }
        
        int max = 0;
        
        for (int i = 0; i < m; i++) {
            max = Math.max(max, largestRectangleArea(dp[i]));
        }
        
        return max;
    }
    
    private int largestRectangleArea(int[] heights) {
        int len = heights.length;
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        
        for (int i = 0; i <= len; i++) {
            int height = (i == len ? Integer.MIN_VALUE : heights[i]);
            
            while (!stack.isEmpty() && height < heights[stack.peek()]) {
                int index = stack.pop();
                int h = heights[index];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                max = Math.max(h * w, max);
            }
            
            stack.push(i);
        }
        
        return max;
    }
}