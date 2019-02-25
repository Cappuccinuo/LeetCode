class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4;
                    if (i > 0 && grid[i - 1][j] == 1) {
                        perimeter -= 2;
                    }
                    if (j > 0 && grid[i][j - 1] == 1) {
                        perimeter -= 2;
                    }
                }
            }
        }
        return perimeter;
    }
}

class Solution {
    int row, col;
    
    public int islandPerimeter(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        row = grid.length;
        col = grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    return DFS(grid, i, j);
                }
            }
        }
        return 0;
    }
    
    private int DFS(int[][] grid, int i, int j) {
        if (!inBound(i, j)) {
            return 1;
        }
        
        if (grid[i][j] == 0) {
            return 1;
        }
        
        if (grid[i][j] == -1) {
            return 0;
        }
        int count = 0;
        grid[i][j] = -1;
        
        count += DFS(grid, i + 1, j);
        count += DFS(grid, i - 1, j);
        count += DFS(grid, i, j + 1);
        count += DFS(grid, i, j - 1);
        
        return count;
    }
    
    private boolean inBound(int i, int j) {
        return i >= 0 && i < row && j >= 0 && j < col;
    }
}