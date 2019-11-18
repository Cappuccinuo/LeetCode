class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result = new LinkedList<>();
        
        int row = grid.length;
        int col = grid[0].length;
        int elementsCount = row * col;
        
        k = k % elementsCount;
        
        int rowShift = k / col;
        int colShift = k % col;
        
        /* 
            (i, j) is the start index we start to traverse
            colShift == 0 && rowShift == 0 -> No shift, start from (0, 0)
            colShift == 0 && rowShift != 0 -> Only rowShift, start from (row - rowShift, 0)
            colShift != 0                  -> Start from (row - rowShift - 1, col - colShift)
        */
        int i = colShift == 0 ? (rowShift == 0 ? 0 
                                               : row - rowShift) 
                              : row - rowShift - 1;
        int j = colShift == 0 ? 0 : col - colShift;
        
        int rowCount = row;
        int colCount = col;
        for (int a = 0; a < rowCount; a++) {
            List<Integer> newList = new LinkedList<>();
            for (int b = 0; b < colCount; b++) {
                newList.add(grid[i][j]);
                int[] pos = getNext(i, j, row, col);
                i = pos[0];
                j = pos[1];
            }
            result.add(newList);
            colCount = col;
        }
        return result;
    }
    
    private int[] getNext(int i, int j, int row, int col) {
        if (i == row - 1 && j == col - 1) {
            return new int[]{0, 0};
        }
        else if (j == col - 1) {
            return new int[]{i + 1, 0};
        }
        else {
            return new int[]{i, j + 1};
        }
    } 
}