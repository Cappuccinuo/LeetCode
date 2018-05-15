// 2018.5.15
class Solution {
    int[] dx = new int[]{1, 0};
    int[] dy = new int[]{0, 1};
    
    public int kthSmallest(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0) {
            return -1;
        }
        if (matrix.length * matrix[0].length < k) {
            return -1;
        }
        PriorityQueue<Number> queue = new PriorityQueue<Number>(k, new numberComparator());
        queue.offer(new Number(0, 0, matrix[0][0]));
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        visited[0][0] = true;
        for (int i = 0; i < k - 1; i++) {
            Number smallest = queue.poll();
            for (int j = 0; j < 2; j++) {
                int nx = smallest.x + dx[j];
                int ny = smallest.y + dy[j];
                if (isValid(nx, ny, matrix, visited)) {
                    visited[nx][ny] = true;
                    queue.offer(new Number(nx, ny, matrix[nx][ny]));
                }
            }
        }
        return queue.peek().val;
    }
    
    private boolean isValid(int x, int y, int[][] matrix, boolean[][] visited) {
        return x < matrix.length && y < matrix[x].length && !visited[x][y];
    }
}

class numberComparator implements Comparator<Number> {
    public int compare(Number a, Number b) {
        return a.val - b.val;
    }
}

class Number {
    int x;
    int y;
    int val;
    public Number(int x, int y, int val) {
        this.x = x;
        this.y = y;
        this.val = val;
    }
}