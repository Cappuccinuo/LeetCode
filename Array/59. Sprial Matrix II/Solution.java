class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int d = 0;
        int x = 0;
        int y = 0;
        boolean[][] visited = new boolean[n][n];
        int flag = 1;
        
        int[] deltaR = new int[]{0, 1, 0, -1};
        int[] deltaC = new int[]{1, 0, -1, 0};
        
        for (int i = 0; i < n * n; i++) {
            result[x][y] = flag;
            visited[x][y] = true;
            
            int r = x + deltaR[d];
            int c = y + deltaC[d];
            if (r >= 0 && r < n && c >= 0 && c < n && !visited[r][c]) {
                x = r;
                y = c;
            }
            else {
                d = (d + 1) % 4;
                x = x + deltaR[d];
                y = y + deltaC[d];
            }
            
            flag++;
        }
        
        return result;
    }
}