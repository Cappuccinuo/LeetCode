class Solution {
    public List<int[]> pacificAtlantic(int[][] matrix) {
        List<int[]> result = new LinkedList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        Queue<int[]> atlantic = new LinkedList<>();
        Queue<int[]> pacific = new LinkedList<>();
        
        int i, j;
        boolean[][] avisited = new boolean[m][n];
        boolean[][] pvisited = new boolean[m][n];
        for (i = 0; i < m; i++) {
            atlantic.add(new int[]{i, n - 1});
            pacific.add(new int[]{i, 0});
            avisited[i][n - 1] = true;
            pvisited[i][0] = true;
        }
        for (j = 0; j < n; j++) {
            atlantic.add(new int[]{m - 1, j});
            pacific.add(new int[]{0, j});
            avisited[m - 1][j] = true;
            pvisited[0][j] = true;
        }
        BFS(matrix, atlantic, avisited);
        BFS(matrix, pacific, pvisited);
        
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (avisited[i][j] && pvisited[i][j]) {
                    result.add(new int[]{i, j});
                }
            }
        }
        
        return result;
    }
    
    private void BFS(int[][] matrix, 
                     Queue<int[]> queue, 
                     boolean[][] visited) {
        int[][] direction = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        
        while (!queue.isEmpty()) {
            int[] front = queue.poll();
            int i = front[0];
            int j = front[1];
            
            for (int k = 0; k < direction.length; k++) {
                int x = i + direction[k][0];
                int y = j + direction[k][1];
                if (x < 0 || x >= matrix.length 
                    || y < 0 || y >= matrix[0].length
                    || visited[x][y] || matrix[x][y] < matrix[i][j]) {
                    continue;
                }
                queue.add(new int[]{x, y});
                visited[x][y] = true;
            }
        }
    }
}

class Solution {
    int[][] direction = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    
    public List<int[]> pacificAtlantic(int[][] matrix) {
        List<int[]> result = new LinkedList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        
        int i, j;
        boolean[][] avisited = new boolean[m][n];
        boolean[][] pvisited = new boolean[m][n];
        for (i = 0; i < m; i++) {
            avisited[i][n - 1] = true;
            DFS(matrix, i, n - 1, avisited);
            pvisited[i][0] = true;
            DFS(matrix, i, 0, pvisited);
        }
        
        for (j = 0; j < n; j++) {
            pvisited[0][j] = true;
            DFS(matrix, 0, j, pvisited);
            avisited[m - 1][j] = true;
            DFS(matrix, m - 1, j, avisited);
        }
        
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (avisited[i][j] && pvisited[i][j]) {
                    result.add(new int[]{i, j});
                }
            }
        }
        
        return result;
    }
    
    private void DFS(int[][] matrix, int i, int j, boolean[][] visited) {
        for (int k = 0; k < direction.length; k++) {
            int[] d = direction[k];
            int x = i + d[0];
            int y = j + d[1];
            
            if (x < 0 || y < 0 
                || x >= matrix.length || y >= matrix[0].length 
                || visited[x][y] || matrix[x][y] < matrix[i][j]) {
                continue;
            }   
            visited[x][y] = true;
            DFS(matrix, x, y, visited);
        }
    }
}