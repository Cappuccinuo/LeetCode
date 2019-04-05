class Solution {
    int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    
    public int numEnclaves(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        
        UnionFind uf = new UnionFind(m * n + 1);
        
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (A[i][j] == 0) {
                    continue;
                }
                int index = getIndex(i, j, n);
                if (onBound(i, j, m, n)) {
                    uf.union(index, 0);
                }
                for (int[] direction : directions) {
                    int x = i + direction[0];
                    int y = j + direction[1];
                    if (!inBound(x, y, m, n) || A[x][y] == 0) {
                        continue;
                    }
                    uf.union(index, getIndex(x, y, n));
                }
            }
        }
        int res = 0;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (A[i][j] == 1 && uf.find(getIndex(i, j, n)) != uf.find(0)) {
                    res++;
                }
            }
        }
        return res;
    }
    
    private boolean onBound(int i, int j, int m, int n) {
        return i == 0 || j == 0 || i == m - 1 || j == n - 1;
    }
    
    private boolean inBound(int i, int j, int m, int n) {
        return i >= 0 && i < m && j >= 0 && j < n;
    }
    
    private int getIndex(int i, int j, int n) {
        return i * n + j + 1;
    }
}

class UnionFind {
    int[] father;
    
    UnionFind(int N) {
        this.father = new int[N];
        int i;
        for (i = 0; i < N; i++) {
            father[i] = i;
        }
    }
    
    void union(int a, int b) {
        int root_a = find(a);
        int root_b = find(b);
        if (root_a != root_b) {
            father[root_a] = root_b;
        }
    }
    
    int find(int x) {
        if (father[x] == x) {
            return x;
        }
        Stack<Integer> stack = new Stack<>();
        while (father[x] != x) {
            stack.push(x);
            x = father[x];
        }
        while (!stack.isEmpty()) {
            father[stack.pop()] = x;
        }
        return x;
    }
}



// DFS
class Solution {
    public int numEnclaves(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (onBound(i, j, m, n)) {
                    DFS(A, i, j, m, n);
                }
            }
        }
        int res = 0;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (A[i][j] == 1) {
                    res++;
                }
            }
        }
        return res;
    }
    
    private void DFS(int[][] A, int i, int j, int m, int n) {
        if (!inBound(i, j, m, n) || A[i][j] == 0) {
            return;
        }
        A[i][j] = 0;
        DFS(A, i + 1, j, m, n);
        DFS(A, i, j + 1, m, n);
        DFS(A, i, j - 1, m, n);
        DFS(A, i - 1, j, m, n);
    }

    private boolean inBound(int i, int j, int m, int n) {
        return i >= 0 && i < m && j >= 0 && j < n;
    }
    
    private boolean onBound(int i, int j, int m, int n) {
        return i == 0 || j == 0 || i == m - 1 || j == n - 1;
    }
}


// BFS
class Solution {
    int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    
    public int numEnclaves(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        int i, j;
        boolean[][] visited = new boolean[m][n];
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (onBound(i, j, m, n) && A[i][j] == 1) {
                    BFS(A, i, j, m, n, visited);
                }
            }
        }
        
        int res = 0;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (A[i][j] == 1) {
                    res++;
                }
            }
        }
        return res;
    }
    
    private void BFS(int[][] A, int i, int j, int m, int n, boolean[][] visited) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;
        while (!queue.isEmpty()) {
            int[] front = queue.poll();
            int x = front[0];
            int y = front[1];
            A[x][y] = 0;
            for (int[] direction : directions) {
                int new_x = x + direction[0];
                int new_y = y + direction[1];
                if (!inBound(new_x, new_y, m, n) 
                    || visited[new_x][new_y] 
                    || A[new_x][new_y] == 0) {
                    continue;
                }
                queue.offer(new int[]{new_x, new_y});
                visited[new_x][new_y] = true;
            }
        }
    }
    
    private boolean inBound(int i, int j, int m, int n) {
        return i >= 0 && i < m && j >= 0 && j < n;
    }
    
    private boolean onBound(int i, int j, int m, int n) {
        return i == 0 || j == 0 || i == m - 1 || j == n - 1;
    }
}