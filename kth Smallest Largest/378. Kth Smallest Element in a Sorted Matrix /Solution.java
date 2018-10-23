// 2018.10.19 Time: O(n)  Space: O(1)
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int start = matrix[0][0];
        int end = matrix[m - 1][n - 1];
        
        while (start + 1 < end) {
            int mid = calculateMid(start, end);

            if (countEqualOrLess(matrix, mid) < k) {
                start = mid;
            }
            else {
                end = mid;
            }
        }
        
        if (countEqualOrLess(matrix, start) >= k) {
            return start;
        }
        return end;
    }
    
    private int calculateMid(int start, int end) {
        if (start > 0 || end < 0) {
            return start + (end - start) / 2;
        }
        else {
            return (start + end) / 2;
        }
    }
    
    private int countEqualOrLess(int[][] matrix, int mid) {
        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;
        int i = 0;
        int j = n - 1;
        for (int[] row : matrix) {
            while (j >= 0) {
                if (row[j] <= mid) {
                    count += j + 1;
                    break;
                }
                else {
                    j--;
                }
            }
        }
        return count;
    }
}
// 2018.10.19 Use Property Time: O(klogn) Space: O(n)
class Solution {
    class Index {
        int i;
        int j;
        int val;
        
        Index(int i, int j, int val) {
            this.i = i;
            this.j = j;
            this.val = val;
        }
    }
    
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Index> pq = new PriorityQueue<>(new Comparator<Index>() {
            @Override
            public int compare(Index i1, Index i2) {
                return i1.val - i2.val;
            }
        });
        int m = matrix.length;
        int n = matrix[0].length;
        pq.offer(new Index(0, 0, matrix[0][0]));
        boolean[][] visited = new boolean[m][n];
        visited[0][0] = true;
        int count = 0;
        
        while (!pq.isEmpty()) {
            Index top = pq.poll();
            count++;
            if (count == k) {
                return top.val;
            }
            if (top.j + 1 < n && !visited[top.i][top.j + 1]) {
                pq.offer(new Index(top.i, top.j + 1, matrix[top.i][top.j + 1]));
                visited[top.i][top.j + 1] = true;
            }
            if (top.i + 1 < m && !visited[top.i + 1][top.j]) {
                pq.offer(new Index(top.i + 1, top.j, matrix[top.i + 1][top.j]));
                visited[top.i + 1][top.j] = true;
            }
        }
        
        return -1;
    }
}

// 2018.10.18 Naive
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, Collections.reverseOrder());
        int m = matrix.length;
        int n = matrix[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pq.isEmpty() || pq.size() < k) {
                    pq.offer(matrix[i][j]);
                }
                else {
                    if (matrix[i][j] < pq.peek()) {
                        pq.poll();
                        pq.offer(matrix[i][j]);
                    }
                }
            }
        }
        
        return pq.poll();
    }
}

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