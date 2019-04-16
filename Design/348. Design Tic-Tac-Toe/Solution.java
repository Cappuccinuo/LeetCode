class TicTacToe {
    int[] rowScore;
    int[] colScore;
    int diag;
    int antiDiag;
    int N;
    /** Initialize your data structure here. */
    public TicTacToe(int n) {
        this.N = n;
        rowScore = new int[n];
        colScore = new int[n];
        diag = 0;
        antiDiag = 0;
    }
    
    /** Player {player} makes a move at ({row}, {col}).
        @param row The row of the board.
        @param col The column of the board.
        @param player The player, can be either 1 or 2.
        @return The current winning condition, can be either:
                0: No one wins.
                1: Player 1 wins.
                2: Player 2 wins. */
    public int move(int row, int col, int player) {
        int score = (player == 1) ? 1 : -1;
        rowScore[row] += score;
        colScore[col] += score;
        if (row == col) {
            diag += score;
        }
        if (row + col == N - 1) {
            antiDiag += score;
        }
        if (rowScore[row] == N || colScore[col] == N || diag == N || antiDiag == N) {
            return 1;
        }
        if (rowScore[row] == -N || colScore[col] == -N || diag == -N || antiDiag == -N) {
            return 2;
        }
        return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */

class TicTacToe {
    Map<Integer, Integer> r;
    Map<Integer, Integer> c;
    int diag;
    int antiDiag;
    int N;
    /** Initialize your data structure here. */
    public TicTacToe(int n) {
        this.N = n;
        r = new HashMap<>();
        c = new HashMap<>();
        diag = 0;
        antiDiag = 0;
    }
    
    /** Player {player} makes a move at ({row}, {col}).
        @param row The row of the board.
        @param col The column of the board.
        @param player The player, can be either 1 or 2.
        @return The current winning condition, can be either:
                0: No one wins.
                1: Player 1 wins.
                2: Player 2 wins. */
    public int move(int row, int col, int player) {
        int val = player == 1 ? 1 : -1;
        r.put(row, r.getOrDefault(row, 0) + val);
        c.put(col, c.getOrDefault(col, 0) + val);
        if (row == col) {
            diag += val;
        }
        if (row == N - col - 1) {
            antiDiag += val;
        }
        return checkWinner();
    }
    
    private int checkWinner() {
        for (int row : r.keySet()) {
            if (r.get(row) == N || r.get(row) == -N) {
                return winner(r.get(row));
            }
        }
        for (int col : c.keySet()) {
            if (c.get(col) == N || c.get(col) == -N) {
                return winner(c.get(col));
            }
        }
        if (diag == N || diag == -N) {
            return winner(diag);
        }
        if (antiDiag == N || antiDiag == -N) {
            return winner(antiDiag);
        }
        return 0;
    }
    
    private int winner(int val) {
        if (val == N) {
            return 1;
        }
        return 2;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */