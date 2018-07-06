// 2018.7.7
class Solution {
    public int matrixScore(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        
        int ans = 0;
        
        for (int c = 0; c < col; c++) {
            int cSum = 0;
            for (int r = 0; r < row; r++) {
                cSum += A[r][c] ^ A[r][0];
            }
            ans += Math.max(cSum, row - cSum) * (1 << col - 1 - c);
        }
        
        return ans;
    }
}