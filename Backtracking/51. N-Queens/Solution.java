class Solution {
    private List<List<String>> result = new ArrayList<>();
    
    class Position {
        int row;
        int col;
        Position(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    
    public List<List<String>> solveNQueens(int n) {
        Position[] positions = new Position[n];
        solveNQueensUtil(n, 0, positions);
        return result;
    }
    
    public void solveNQueensUtil(int n, int row, Position[] positions) {
        if (n == row) {
            List<String> solution = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            for (Position pos : positions) {
                for (int i = 0; i < n; i++) {
                    if (pos.col == i) {
                        sb.append("Q");
                    }
                    else {
                        sb.append(".");
                    }
                }
                solution.add(sb.toString());
                sb = new StringBuilder();
            }
            result.add(solution);
            return;
        }
        
        for (int col = 0; col < n; col++) {
            boolean foundSafe = true;
            for (int queen = 0; queen < row; queen++) {
                if (positions[queen].col == col ||
                   positions[queen].row + positions[queen].col == row + col ||
                   positions[queen].row - positions[queen].col == row - col) {
                    foundSafe = false;
                    break;
                }
            }
            if (foundSafe) {
                positions[row] = new Position(row, col);
                solveNQueensUtil(n, row + 1, positions);
                positions[row] = new Position(0, 0);
            }
        }
    }
}