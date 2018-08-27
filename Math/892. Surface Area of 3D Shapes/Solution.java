class Solution {
    public int surfaceArea(int[][] grid) {
        int[] deltaR = new int[]{0, 0, 1, -1};
        int[] deltaL = new int[]{1, -1, 0, 0};
        
        int N = grid.length;
        int ans = 0;
        
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (grid[r][c] > 0) {
                    ans += 2;
                    for (int d = 0; d < 4; d++) {
                        int x = r + deltaR[d];
                        int y = c + deltaL[d];
                        int nv = 0;
                        if (x >= 0 && x < N && y >= 0 && y < N) {
                            nv = grid[x][y];
                        }
                        ans += Math.max(grid[r][c] - nv, 0);
                    }
                }
            }
        }
        
        return ans;
    }
}