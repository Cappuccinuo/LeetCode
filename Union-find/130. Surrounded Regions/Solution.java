class Solution {
    int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    
    public void solve(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }
        int m = board.length;
        int n = board[0].length;
        UnionFind uf = new UnionFind(m * n + 1);
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                int index = getIndex(i, j, n);
                if (i == 0 || j == 0 || i == m - 1 || j == n - 1) {
                    uf.union(0, index);
                }
                for (int[] direction : directions) {
                    int x = i + direction[0];
                    int y = j + direction[1];
                    if (inBound(x, y, m, n)) {
                        if (board[i][j] == board[x][y]) {
                            uf.union(index, getIndex(x, y, n));
                        }
                    }
                }
            }
        }
        
        for (i = 1; i < m - 1; i++) {
            for (j = 1; j < n - 1; j++) {
                if (board[i][j] == 'O') {
                    if (uf.find(0) != uf.find(getIndex(i, j, n))) {
                        board[i][j] = 'X';
                    }
                }
            }
        }
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