// DFS + memo
class Solution {
    double[][][] memo;
    int[][] directions = new int[][]{{-2, -1}, {-1, -2}, {1, -2}, {2, -1}, {2, 1}, {1, 2}, {-1, 2}, {-2, 1}};
    int N;
    public double knightProbability(int N, int K, int r, int c) {
        // We need the third parameter so that we can know which stage we are in
        memo = new double[N][N][K + 1];
        this.N = N;
        return DFS(r, c, K);
    }
    
    private double DFS(int x, int y, int k) {
        if (!inBound(x, y)) {
            return 0;
        }
        
        if (k == 0) {
            return 1;
        }
        
        if (memo[x][y][k] != 0) {
            return memo[x][y][k];
        }
        
        double prob = 0;
        for (int i = 0; i < 8; i++) {
            int[] direction = directions[i];
            int new_x = x + direction[0];
            int new_y = y + direction[1];
            prob += DFS(new_x, new_y, k - 1);
        }
        memo[x][y][k] = prob / 8.0;
        return memo[x][y][k];
    }
    
    private boolean inBound(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N;
    }
}

// DP
class Solution {
    int[][] directions = new int[][]{{-2, -1}, {-1, -2}, {1, -2}, {2, -1}, {2, 1}, {1, 2}, {-1, 2}, {-2, 1}};
    public double knightProbability(int N, int K, int r, int c) {
        double[][] dp = new double[N][N];
        dp[r][c] = 1;
        
        int i, x, y, t;
        
        for (i = 0; i < K; i++) {
            double[][] dp2 = new double[N][N];
            for (x = 0; x < N; x++) {
                for (y = 0; y < N; y++) {
                    if (dp[x][y] > 0) {
                        for (t = 0; t < 8; t++) {
                            int[] direction = directions[t];
                            int new_x = direction[0] + x;
                            int new_y = direction[1] + y;
                            if (inBound(new_x, new_y, N)) {
                                dp2[new_x][new_y] += dp[x][y] / 8.0;
                            }
                        }
                    }
                }
            }
            dp = dp2;
        }
        
        double prob = 0;
        
        for (x = 0; x < N; x++) {
            for (y = 0; y < N; y++) {
                prob += dp[x][y];
            }
        }
        return prob;
    }
    
    private boolean inBound(int x, int y, int N) {
        return x >= 0 && x < N && y >= 0 && y < N;
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

// BFS + DP
class Solution {
    int[][] directions = new int[][]{{-2, -1}, {-1, -2}, {1, -2}, {2, -1}, {2, 1}, {1, 2}, {-1, 2}, {-2, 1}};
    public double knightProbability(int N, int K, int r, int c) {
        double[][] dp = new double[N][N];
        
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(r, c));
        dp[r][c] = 1;
        
        int i, j, k;
        
        for (i = 0; i < K; i++) {
            double[][] dp2 = new double[N][N];
            // One point may be added to queue multiple times
            Set<String> visited = new HashSet();
            int size = queue.size();
            for (j = 0; j < size; j++) {
                Point front = queue.poll();
                int x = front.x;
                int y = front.y;
                for (k = 0; k < 8; k++) {
                    int[] direction = directions[k];
                    int new_x = x + direction[0];
                    int new_y = y + direction[1];
                    if (inBound(new_x, new_y, N)) {
                        dp2[new_x][new_y] += dp[x][y] / 8.0;
                        
                        String symbol = new_x + "#" + new_y;
                        if (visited.contains(symbol)) {
                            continue;
                        }
                        queue.offer(new Point(new_x, new_y));
                        visited.add(symbol);
                    }
                }
            }
            dp = dp2;
        }
        
        double prob = 0;
        
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                prob += dp[i][j];
            }
        }
        return prob;
    }
    
    private boolean inBound(int x, int y, int N) {
        return x >= 0 && x < N && y >= 0 && y < N;
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