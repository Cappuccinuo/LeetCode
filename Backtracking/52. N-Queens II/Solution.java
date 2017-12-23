class Solution {
    private int solution = 0;
    
    class Position {
        int row;
        int col;
        Position(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    
    public int totalNQueens(int n) {
        Position[] positions = new Position[n];
        solveQueenProblemUtil(n, 0, positions);
        return solution;
    }
    
    public void solveQueenProblemUtil(int n, int row, Position[] positions) {
        if (n == row) {
            solution++;
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
                solveQueenProblemUtil(n, row + 1, positions);
                positions[row] = new Position(0, 0);
            }
        }
    }
}