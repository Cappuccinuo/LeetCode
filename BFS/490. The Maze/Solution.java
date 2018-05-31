class Solution {
    int row;
    int col;
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        row = maze.length;
        col = maze[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start[0], start[1]});
        boolean[][] visited = new boolean[row][col];
        visited[start[0]][start[1]] = true;
        
        int[] deltaX = new int[]{0, 0, 1, -1};
        int[] deltaY = new int[]{1, -1, 0, 0};
        
        while (!queue.isEmpty()) {
            int[] front = queue.poll();
            int x = front[0];
            int y = front[1];
            if (x == destination[0] && y == destination[1]) {
                return true;
            }
            for (int i = 0; i < 4; i++) {
                int x0 = x + deltaX[i];
                int y0 = y + deltaY[i];
                while (inBound(x0, y0) && maze[x0][y0] == 0) {
                    x0 += deltaX[i];
                    y0 += deltaY[i];
                }
                x0 -= deltaX[i];
                y0 -= deltaY[i];
                if (!visited[x0][y0]) {
                    queue.offer(new int[]{x0, y0});
                    visited[x0][y0] = true;
                }
            }
        }
        
        return false;
    }
    
    private boolean inBound(int x, int y) {
        return x >= 0 && x < row && y >= 0 && y < col;
    }
}