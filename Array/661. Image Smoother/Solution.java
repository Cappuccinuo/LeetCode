class Solution {
    public int[][] imageSmoother(int[][] M) {
        int rowLen = M.length;
        int columnLen = M[0].length;
        int[] dx = new int[]{0, 0, 1, -1, 1, -1, 1, -1};
        int[] dy = new int[]{-1, 1, 0, 0, 1, -1, -1, 1};
        int[][] result = new int[rowLen][columnLen];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < columnLen; j++) {
                sum = M[i][j];
                count = 1;
                for (int k = 0; k < 8; k++) {
                    if (isValid(M, i + dx[k], j + dy[k])) {
                        sum += M[i + dx[k]][j + dy[k]];
                        count++;
                    }
                }
                result[i][j] = (int)Math.floor(sum / count);
            }
        }
        return result;
    }
    
    public boolean isValid(int[][] M, int i, int j) {
        int rowLen = M.length;
        int columnLen = M[0].length;
        if (i < 0 || i >= rowLen || j < 0 || j >= columnLen) {
            return false;
        }
        return true;
    }
}