class Solution {
    public int maxDistance(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        Queue<int[]> queue = new LinkedList<>();
        
        int i, j;
        int m = grid.length;
        int n = grid[0].length;
        
        boolean[][] visited = new boolean[m][n];
        boolean hasIsland = false;
        boolean hasWater = false;
        
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    visited[i][j] = true;
                    hasIsland = true;
                    queue.offer(new int[]{i, j});
                }
                else {
                    hasWater = true;
                }
            }
        }
        
        if (!hasIsland || !hasWater) {
            return -1;
        }
        
        int max = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (j = 0; j < size; j++) {
                int[] front = queue.poll();
                int x = front[0];
                int y = front[1];
                for (i = 0; i < 4; i++) {
                    int next_x = x + directions[i][0];
                    int next_y = y + directions[i][1];
                    
                    if (!inBound(next_x, next_y, m, n)) {
                        continue;
                    }
                    if (visited[next_x][next_y]) {
                        continue;
                    }
                    queue.offer(new int[]{next_x, next_y});
                    visited[next_x][next_y] = true;
                }
            }
            max++;
        }
        
        return max - 1;
    }
    
    private boolean inBound(int i, int j, int m, int n) {
        return i >= 0 && i < m && j >= 0 && j < n;
    }
}