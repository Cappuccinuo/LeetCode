class Solution {
    int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    
    public int[][] updateMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] result = new int[m][n];
        Queue<int[]> queue = new LinkedList<>();
        
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                result[i][j] = Integer.MAX_VALUE;        
            }
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    result[i][j] = 0;
                    queue.offer(new int[]{i, j});
                }
            }
        }
        BFS(queue, matrix, result);
        return result;
    }
    
    private void BFS(Queue<int[]> queue, int[][] matrix, int[][] result) {
        while (!queue.isEmpty()) {
            int[] front = queue.poll();
            for (int[] direction : directions) {
                int newX = front[0] + direction[0];
                int newY = front[1] + direction[1];
                if (newX < 0 || newY < 0 || newX >= matrix.length || newY >= matrix[0].length) {
                    continue;
                }
                if (result[newX][newY] < result[front[0]][front[1]] + 1) {
                    continue;
                }
                queue.offer(new int[]{newX, newY});
                result[newX][newY] = result[front[0]][front[1]] + 1;
            }
        }
    }
}