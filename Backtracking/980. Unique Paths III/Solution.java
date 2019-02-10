class Solution {
    int m;
    int n;
    int ans = 0;
    // Starting Square is also empty
    int free = 1;
    int sx, sy;
    int ex, ey;
    
    public int uniquePathsIII(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    sx = i;
                    sy = j;
                }
                else if (grid[i][j] == 2) {
                    ex = i;
                    ey = j;
                }
                else if (grid[i][j] == 0) {
                    free++;
                }
            }
        }
        
        DFS(grid, sx, sy);
        return ans;
    }
    
    private void DFS(int[][] grid, int x, int y) {
        if (!inBound(x, y) || grid[x][y] < 0) {
            return;
        }
        
        if (x == ex && y == ey && free == 0) {
            ans++;
            return;
        }
        
        grid[x][y] = -2;
        free--;
        DFS(grid, x + 1, y);
        DFS(grid, x, y + 1);
        DFS(grid, x - 1, y);
        DFS(grid, x, y - 1);
        free++;
        grid[x][y] = 0;
    }
    
    private boolean inBound(int i, int j) {
        return i >= 0 && i < m && j >= 0 && j < n;
    }
}