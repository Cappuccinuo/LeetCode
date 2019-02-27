// BFS from building with early termination
class Solution {
    int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    int row;
    int col;
    public int shortestDistance(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return -1;
        }
        
        row = grid.length;
        col = grid[0].length;
        
        int[][] distance = new int[row][col];
        
        int i, j;
        
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (grid[i][j] == 1 && !findAllEmpty(grid, i, j, distance)) {
                    return -1;
                }
            }
        }
        
        int shortest = Integer.MAX_VALUE;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (grid[i][j] == 0 && distance[i][j] > 0) {
                    shortest = Math.min(shortest, distance[i][j]);
                }
            }
        }
        
        return shortest == Integer.MAX_VALUE ? -1 : shortest;
    }
    
    private boolean findAllEmpty(int[][] grid, int i, int j, int[][] distance) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(i, j));
        boolean[][] visited = new boolean[row][col];
        visited[i][j] = true;
        int dis = 0;
        int k, t;
        while (!queue.isEmpty()) {
            int size = queue.size();
            dis++;
            for (k = 0; k < size; k++) {
                Point front = queue.poll();
                int x = front.x;
                int y = front.y;
                
                for (t = 0; t < directions.length; t++) {
                    int[] direction = directions[t];
                    int new_x = x + direction[0];
                    int new_y = y + direction[1];
                    if (inBound(new_x, new_y) && !visited[new_x][new_y]) {
                        visited[new_x][new_y] = true;
                        if (grid[new_x][new_y] == 0) {
                            distance[new_x][new_y] += dis;
                            queue.offer(new Point(new_x, new_y));
                        }
                    }
                }
            }
        }
        
        for (k = 0; k < row; k++) {
            for (t = 0; t < col; t++) {
                if (!visited[k][t]) {
                    if (grid[k][t] == 1) {
                        return false;
                    }
                    else if (grid[k][t] == 0) {
                        grid[k][t] = -1;
                    }
                }
            }
        }
        return true;
    }
    
    private boolean inBound(int x, int y) {
        return x >= 0 && x < row && y >= 0 && y < col;
    }
}

class Point {
    int x;
    int y;
    Point(int a, int b) {
        this.x = a;
        this.y = b;
    }
}

// BFS from building
class Solution {
    int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int shortestDistance(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return -1;
        }
        int row = grid.length;
        int col = grid[0].length;
        int i, j;
        int[][] distance = new int[row][col];
        int[][] reached = new int[row][col];
        
        int buildNum = 0;
        
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    buildNum++;
                    BFS(grid, i, j, distance, reached);
                }
            }
        }
        
        int res = Integer.MAX_VALUE;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (grid[i][j] == 0 && reached[i][j] == buildNum) {
                    res = Math.min(res, distance[i][j]);
                }
            }
        }
        
        return res == Integer.MAX_VALUE ? -1 : res;
    }
    
    private void BFS(int[][] grid, int i, int j, int[][] distance, int[][] reached) {
        Queue<Point> queue = new LinkedList<>();
        int step = 0;
        queue.offer(new Point(i, j));
        
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] visited = new boolean[row][col];
        visited[i][j] = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            step++;
            for (int t = 0; t < size; t++) {
                Point front = queue.poll();
                int x = front.x;
                int y = front.y;

                for (int k = 0; k < 4; k++) {
                    int[] direction = directions[k];
                    int new_x = direction[0] + x;
                    int new_y = direction[1] + y;

                    if (inBound(new_x, new_y, grid) && !visited[new_x][new_y] && grid[new_x][new_y] == 0) {
                        distance[new_x][new_y] += step;
                        reached[new_x][new_y]++;
                        
                        visited[new_x][new_y] = true;
                        queue.offer(new Point(new_x, new_y));
                    }
                }
            }
        }
    }
    
    private boolean inBound(int x, int y, int[][] grid) {
        return x >= 0 && x < grid.length && y >= 0 && y < grid[0].length;
    }
}

class Point {
    int x;
    int y;
    Point(int a, int b) {
        this.x = a;
        this.y = b;
    }
}

// BFS from empty position
class Solution {
    int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    int row;
    int col;
    public int shortestDistance(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return -1;
        }
        row = grid.length;
        col = grid[0].length;
        int i, j;
        int res = Integer.MAX_VALUE;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (grid[i][j] == 0) {
                    res = Math.min(res, BFS(grid, i, j));
                }
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
    
    private int BFS(int[][] grid, int i, int j) {
        Queue<Point> queue = new LinkedList<>();
        int res = 0;
        int step = 0;
        queue.offer(new Point(i, j));
        boolean[][] visited = new boolean[row][col];
        visited[i][j] = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            step++;
            for (int t = 0; t < size; t++) {
                Point front = queue.poll();
                int x = front.x;
                int y = front.y;

                for (int k = 0; k < 4; k++) {
                    int[] direction = directions[k];
                    int new_x = direction[0] + x;
                    int new_y = direction[1] + y;
                    
                    if (inBound(new_x, new_y, grid) && !visited[new_x][new_y]) {
                        visited[new_x][new_y] = true;
                        if (grid[new_x][new_y] == 1) {
                            res += step;
                        }
                        if (grid[new_x][new_y] == 2) {
                            continue;
                        }
                        if (grid[new_x][new_y] == 0) {
                            queue.offer(new Point(new_x, new_y));
                        }
                    }
                }
            }
        }
        
        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
                if (grid[a][b] == 1 && !visited[a][b]) {
                    return Integer.MAX_VALUE;
                }
            }
        }
        
        return res;
    }
    
    private boolean inBound(int x, int y, int[][] grid) {
        return x >= 0 && x < grid.length && y >= 0 && y < grid[0].length;
    }
}

class Point {
    int x;
    int y;
    Point(int a, int b) {
        this.x = a;
        this.y = b;
    }
}