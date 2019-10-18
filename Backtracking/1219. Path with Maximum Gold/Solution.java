class Solution {
    int[][] directions = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

    public int getMaximumGold(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        
        int i, j;
        int max = 0;
        boolean[][] visited = new boolean[m][n];
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    max = Math.max(max, getMaximumGoldHelper(grid, i, j, m, n, visited));
                }
            }
        }
        return max;
    }
    
    private int getMaximumGoldHelper(int[][] grid, int i, int j, int m, int n, boolean[][] visited) {
        int k;
        int max = 0;
        visited[i][j] = true;
        for (k = 0; k < 4; k++) {
            int next_x = i + directions[k][0];
            int next_y = j + directions[k][1];
            if (!inBound(m, n, next_x, next_y) || visited[next_x][next_y] || grid[next_x][next_y] == 0) {
                continue;
            }
            max = Math.max(max, getMaximumGoldHelper(grid, next_x, next_y, m, n, visited));
        }
        visited[i][j] = false;
        return max + grid[i][j];
    }
    
    private boolean inBound(int m, int n, int i, int j) {
        return i >= 0 && i < m && j >= 0 && j < n;
    }
}