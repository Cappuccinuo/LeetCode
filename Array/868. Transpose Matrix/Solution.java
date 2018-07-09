// 2018.7.8 During Contest
class Solution {
    public int[][] transpose(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int[][] B = new int[col][row];
        
        for (int r = 0; r < col; r++) {
            for (int c = 0; c < row; c++) {
                B[r][c] = A[c][r];
            }
        }
        return B;
    }
}