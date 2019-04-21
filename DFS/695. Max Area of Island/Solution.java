class Solution {
    private static final int[][] DIRECTIONS = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int i, j;
        int maxArea = 0;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(DFS(grid, i, j, m, n), maxArea);
                }
            }
        }
        return maxArea;
    }
    
    private int DFS(int[][] grid, int i, int j, int m, int n) {
        if (!inBound(i, j, m, n) || grid[i][j] == 0) {
            return 0;
        }
        
        grid[i][j] = 0;
        int area = 1;
        for (int[] direction : DIRECTIONS) {
            area += DFS(grid, i + direction[0], j + direction[1], m, n);
        }
        return area;
    }
    
    private boolean inBound(int i, int j, int m, int n) {
        return i >= 0 && i < m && j >= 0 && j < n;
    }
}