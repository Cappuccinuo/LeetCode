class Solution {
    int[][] directions = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}, {1, 1}, {-1, 1}, {-1, -1}, {1, -1}};
    
    public char[][] updateBoard(char[][] board, int[] click) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(click);
        int m = board.length;
        int n = board[0].length;
        
        while (!queue.isEmpty()) {
            int[] front = queue.poll();
            int x = front[0];
            int y = front[1];
            if (board[x][y] == 'M') {
                board[x][y] = 'X';
            }
            else {
                int count = 0;
                for (int[] direction : directions) {
                    int new_x = x + direction[0];
                    int new_y = y + direction[1];
                    if (!inBound(new_x, new_y, m, n)) {
                        continue;
                    }
                    if (board[new_x][new_y] == 'M') {
                        count++;
                    }
                }
                if (count > 0) {
                    board[x][y] = (char)(count + '0');
                }
                else {
                    board[x][y] = 'B';
                    for (int[] direction : directions) {
                        int new_x = x + direction[0];
                        int new_y = y + direction[1];
                        if (!inBound(new_x, new_y, m, n)) {
                            continue;
                        }
                        if (board[new_x][new_y] == 'E') {
                            board[new_x][new_y] = 'B';
                            queue.offer(new int[]{new_x, new_y});
                        }
                    }
                }
            }
        }
        
        return board;
    }
    
    private boolean inBound(int x, int y, int m, int n) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }
}