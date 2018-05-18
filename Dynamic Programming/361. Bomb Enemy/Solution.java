class Solution {
    public int maxKilledEnemies(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        
        int max = 0;
        int row = 0;
        int[] col = new int[grid[0].length];
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 'W') {
                    continue;
                }
                
                if (j == 0 || grid[i][j - 1] == 'W') {
                    row = killEnemiesRow(grid, i, j);
                }
                
                if (i == 0 || grid[i - 1][j] == 'W') {
                    col[j] = killEnemiesCol(grid, i, j);
                }
                
                if (grid[i][j] == '0') {
                    max = Math.max(max, row + col[j]);
                }
            }
        }
        return max;
    }
    
    private int killEnemiesRow(char[][] grid, int row, int col) {
        int num = 0;
        while (col < grid[0].length && grid[row][col] != 'W') {
            if (grid[row][col] == 'E') {
                num++;
            }
            col++;
        }
        return num;
    }
    
    private int killEnemiesCol(char[][] grid, int row, int col) {
        int num = 0;
        while (row < grid.length && grid[row][col] != 'W') {
            if (grid[row][col] == 'E') {
                num++;
            }
            row++;
        }
        return num;
    }
}