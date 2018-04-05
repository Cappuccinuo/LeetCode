// 2018.4.4 BFS
class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        
        int islands = 0;
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    grid[i][j] = '0';
                    Coordinate coord = new Coordinate(i, j);
                    markBFS(grid, coord);
                }
            }
        }
        
        return islands;
    }
    
    public void markBFS(char[][] grid, Coordinate coord) {
        int[] xDis = new int[]{0, 0, 1, -1};
        int[] yDis = new int[]{1, -1, 0, 0};
        Queue<Coordinate> queue = new LinkedList<>();
        queue.offer(coord);
        
        while (!queue.isEmpty()) {
            Coordinate cd = queue.poll();
            for (int i = 0; i < 4; i++) {
                int newX = cd.x + xDis[i];
                int newY = cd.y + yDis[i];
                Coordinate newCoord = new Coordinate(newX, newY);
                if (!inBound(grid, newCoord)) {
                    continue;
                }
                if (grid[newX][newY] == '1') {
                    grid[newX][newY] = '0';
                    queue.offer(newCoord);
                }
            }
        }
    }
    
    public boolean inBound(char[][] grid, Coordinate coord) {
        int m = grid.length;
        int n = grid[0].length;
        return coord.x >= 0 && coord.x < m && coord.y >= 0 && coord.y < n;
    }
}

class Coordinate {
    int x;
    int y;
    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}