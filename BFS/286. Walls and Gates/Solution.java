class Solution {
    int[] dx = new int[]{0, 0, 1, -1};
    int[] dy = new int[]{1, -1, 0, 0};
    int row;
    int col;
    
    public void wallsAndGates(int[][] rooms) {
        if (rooms == null || rooms.length == 0 || rooms[0].length == 0) {
            return;
        }
        row = rooms.length;
        col = rooms[0].length;
        Queue<Point> queue = new LinkedList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (rooms[i][j] == 0) {
                    queue.offer(new Point(i, j));
                }
            }
        }
        BFS(rooms, queue);
    }
    
    private void BFS(int[][] rooms, Queue<Point> queue) {
        while (!queue.isEmpty()) {
            Point first = queue.poll();
            int x = first.i;
            int y = first.j;
            for (int d = 0; d < 4; d++) {
                int new_x = x + dx[d];
                int new_y = y + dy[d];
                if (!isValid(new_x, new_y) || rooms[new_x][new_y] != Integer.MAX_VALUE) {
                    continue;
                }
                rooms[new_x][new_y] = rooms[x][y] + 1;
                queue.offer(new Point(new_x, new_y));
            }
        } 
    }
    
    private boolean isValid(int i, int j) {
        return i >= 0 && i < row && j >= 0 && j < col;
    }
}

class Point {
    int i;
    int j;
    Point(int x, int y) {
        this.i = x;
        this.j = y;
    }
}