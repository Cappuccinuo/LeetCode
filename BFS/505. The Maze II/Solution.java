class Solution {
    public int shortestDistance(int[][] maze, int[] start, int[] destination) {
        int row = maze.length;
        int col = maze[0].length;
        int[][] distance = new int[row][col];
        for (int[] dis : distance) {
            Arrays.fill(dis, Integer.MAX_VALUE);
        }
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start[0], start[1]});
        distance[start[0]][start[1]] = 0;
        
        int[][] delta = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        
        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            for (int[] del : delta) {
                int count = 0;
                int x = node[0] + del[0];
                int y = node[1] + del[1];
                while (inBound(row, col, x, y) && maze[x][y] == 0) {
                    x += del[0];
                    y += del[1];
                    count++;
                }
                x -= del[0];
                y -= del[1];
                if (distance[node[0]][node[1]] + count < distance[x][y]) {
                    distance[x][y] = count + distance[node[0]][node[1]];
                    queue.offer(new int[]{x, y});
                }
            }
        }
        
        return distance[destination[0]][destination[1]] == Integer.MAX_VALUE ? -1 : distance[destination[0]][destination[1]];
    }
    
    private boolean inBound(int row, int col, int x, int y) {
        return x >= 0 && x < row && y >= 0 && y < col;
    }
}