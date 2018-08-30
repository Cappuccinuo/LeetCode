class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new LinkedList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] visited = new boolean[m][n];
        int[] deltaR = new int[]{0, 1, 0, -1};
        int[] deltaC = new int[]{1, 0, -1, 0};
        
        int x = 0;
        int y = 0;
        int d = 0;
        
        for (int i = 0; i < m * n; i++) {
            result.add(matrix[x][y]);
            visited[x][y] = true;
            
            int r = x + deltaR[d];
            int c = y + deltaC[d];
            
            if (r >= 0 && r < m && c >= 0 && c < n && !visited[r][c]) {
                x = r;
                y = c;
            }
            else {
                d = (d + 1) % 4;
                x = x + deltaR[d];
                y = y + deltaC[d];
            }
        }
        
        return result;
    }
}