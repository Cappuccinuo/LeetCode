// DFS
class Solution {
    private int m;
    private int n;
    public int numIslands(char[][] grid) {
        m = grid.length;
        if (grid == null || m == 0) {
            return 0;
        }
        n = grid[0].length;
        int num_island = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    num_island++;
                    dfs(grid, i, j);
                }
            }
        }
        return num_island;
    }
    
    public void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
    }
}