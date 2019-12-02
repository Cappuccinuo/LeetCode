class Solution {
    public int countServers(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[] rowCount = new int[row];
        int[] colCount = new int[col];
        int countServer = 0;
        
        int i, j;
        
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    rowCount[i]++;
                    colCount[j]++;
                    countServer++;
                }
            }
        }

        // Eliminate the server count that 
        // on which row and col there are only 1 count
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (grid[i][j] == 1 && rowCount[i] == 1 && colCount[j] == 1) {
                    countServer--;
                } 
            }
        }
        
        return countServer;
    }
}