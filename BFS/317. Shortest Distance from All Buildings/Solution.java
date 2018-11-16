class Solution {
    int[] dx = new int[]{0, 0, -1, 1};
    int[] dy = new int[]{1, -1, 0, 0};
    int row;
    int col;
    
    public int shortestDistance(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 0) {
                    int dist = bfs(grid, i, j);
                    res = Math.min(res, dist);
                }
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
    
    private int bfs(int[][] grid, int i, int j) {
        Queue<Coordinate> queue = new LinkedList<>();
        Coordinate origin = new Coordinate(i, j);
        queue.offer(origin);
        int dist = 0;
        int path = 0;
        boolean[][] visited = new boolean[row][col];
        visited[i][j] = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            path++;
            for (int k = 0; k < size; k++) {
                Coordinate first = queue.poll();
                int x = first.x;
                int y = first.y;
                for (int step = 0; step < 4; step++) {
                    int new_x = x + dx[step];
                    int new_y = y + dy[step];
                    
                    if (!inBound(new_x, new_y) || visited[new_x][new_y]) {
                        continue;
                    }
                    visited[new_x][new_y] = true;
                    if (grid[new_x][new_y] == 1) {
                        dist += path;
                    }
                    if (grid[new_x][new_y] == 2) {
                        continue;
                    }
                    if (grid[new_x][new_y] == 0) {
                        queue.offer(new Coordinate(new_x, new_y));
                    }
                }
            }
        }
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (grid[r][c] == 1 && !visited[r][c]) {
                    return Integer.MAX_VALUE;
                }
            }
        }
        return dist;
    }
    
    private boolean inBound(int i, int j) {
        return i >= 0 && i < row && j >= 0 && j < col;
    }
    
    class Coordinate {
        int x;
        int y;
        Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}