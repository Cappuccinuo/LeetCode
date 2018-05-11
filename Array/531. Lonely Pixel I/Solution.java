// 2018.5.11
class Solution {
    public int findLonelyPixel(char[][] picture) {
        int row = picture.length;
        
        if (picture == null || row == 0) {
            return 0;
        }
        
        int col = picture[0].length;
        
        int[] rowBlack = new int[row];
        int[] colBlack = new int[col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (picture[i][j] == 'B') {
                    rowBlack[i]++;
                    colBlack[j]++;
                }
            }
        }
        
        int count = 0;
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (picture[i][j] == 'B') {
                    if (rowBlack[i] == 1 && colBlack[j] == 1) {
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
}