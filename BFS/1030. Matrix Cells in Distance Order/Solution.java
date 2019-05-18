class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{r0, c0});
        int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int[][] result = new int[R * C][2];
        boolean[][] visited= new boolean[R][C];
        visited[r0][c0] = true;
        int index = 0;
        int i, j;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (i = 0; i < size; i++) {
                int[] front = queue.poll();
                result[index++] = front;
                int x = front[0];
                int y = front[1];
                for (j = 0; j < 4; j++) {
                    int[] direction = directions[j];
                    int new_x = x + direction[0];
                    int new_y = y + direction[1];
                    if (!inBound(new_x, new_y, R, C)) {
                        continue;
                    }
                    if (visited[new_x][new_y]) {
                        continue;
                    }
                    queue.offer(new int[]{new_x, new_y});
                    visited[new_x][new_y] = true;
                }
            }
        }
        return result;
    }
    
    private boolean inBound(int i, int j, int m, int n) {
        return i >= 0 && i < m && j >= 0 && j < n;
    }
}



class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return getDistance(r0, c0, a[0], a[1]) - getDistance(r0, c0, b[0], b[1]);
            }
        });
        int i, j;
        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++) {
                pq.offer(new int[]{i, j});
            }
        }
        int[][] result = new int[R * C][2];
        int index = 0;
        while (!pq.isEmpty()) {
            int[] temp = pq.poll();
            result[index++] = temp;
        }
        return result;
    }
    
    private int getDistance(int r0, int c0, int r1, int c1) { 
        return Math.abs(r0 - r1) + Math.abs(c0 - c1);
    }
}