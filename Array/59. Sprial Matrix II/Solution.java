// Two Pointer
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
// Four Pointer
class Solution {
    public int[][] generateMatrix(int n) {
        int count = 1;
        int[][] result = new int[n][n];
        int r1 = 0;
        int c1 = 0;
        int r2 = n - 1;
        int c2 = n - 1;
        
        while (r1 <= r2 && c1 <= c2) {
            for (int j = c1; j <= c2; j++) {
                result[r1][j] = count;
                count++;
            }
            for (int i = r1 + 1; i <= r2; i++) {
                result[i][c2] = count;
                count++;
            }
            if (r1 < r2 && c1 < c2) {
                for (int j = c2 - 1; j >= c1; j--) {
                    result[r2][j] = count;
                    count++;
                }
                for (int i = r2 - 1; i > r1; i--) {
                    result[i][c1] = count;
                    count++;
                }
            }
            c1++;
            r1++;
            c2--;
            r2--;
        }
        
        return result;
    }
}