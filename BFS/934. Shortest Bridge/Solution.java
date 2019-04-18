class Solution {
    int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    
    public int shortestBridge(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        int i, j;
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();
        search: for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (A[i][j] == 1) {
                    DFS(A, i, j, m, n, visited, queue);
                    break search;
                }
            }
        }

        int step = 0;
    
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (i = 0; i < size; i++) {
                int[] front = queue.poll();
                int x = front[0];
                int y = front[1];
                
                for (int[] direction : directions) {
                    int new_x = x + direction[0];
                    int new_y = y + direction[1];
                    if (!inBound(new_x, new_y, m, n) || visited[new_x][new_y]) {
                        continue;
                    }
                    if (A[new_x][new_y] == 1) {
                        return step;
                    }
                    queue.offer(new int[]{new_x, new_y});
                    visited[new_x][new_y] = true;
                }
            }
            step++;
        }
        return step;
    }
    
    private void DFS(int[][] A, int i, int j, int m, int n, boolean[][] visited, Queue<int[]> queue) {
        if (!inBound(i, j, m, n) || A[i][j] != 1 || visited[i][j]) {
            return;
        }
        queue.offer(new int[]{i, j});
        visited[i][j] = true;
        for (int[] direction : directions) {
            int new_i = i + direction[0];
            int new_j = j + direction[1];
            DFS(A, new_i, new_j, m, n, visited, queue);
        }
    }
    
    private boolean inBound(int i, int j, int m, int n) {
        return i >= 0 && i < m && j >= 0 && j < n;
    }
}