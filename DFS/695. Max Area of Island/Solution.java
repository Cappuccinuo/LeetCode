class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxarea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    maxarea = Math.max(maxarea, areaOfIsland(grid, i, j));
                }
            }
        }
        return maxarea;
    }
    
    public int areaOfIsland(int[][] grid, int i, int j) {
        if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1) {
            grid[i][j] = 0;
            int area = areaOfIsland(grid, i + 1, j) + areaOfIsland(grid, i - 1, j) 
                + areaOfIsland(grid, i, j - 1) + areaOfIsland(grid, i, j + 1) + 1;
            return area;
        }
        return 0;
    }
}