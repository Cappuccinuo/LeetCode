class Solution {
    public int regionsBySlashes(String[] grid) {
        int N = grid.length;
        UnionFind uf = new UnionFind(N * N * 4);
        
        for (int i = 0; i < N; i++) {
            String row = grid[i];
            for (int j = 0; j < N; j++) {
                if (i > 0) {
                    uf.union(getIndex(i - 1, j, N, 2), getIndex(i, j, N, 0));
                }
                
                if (j > 0) {
                    uf.union(getIndex(i, j - 1, N, 1), getIndex(i, j, N, 3));
                }
                
                char symbol = row.charAt(j);
                
                if (symbol != '/') {
                    uf.union(getIndex(i, j, N, 0), getIndex(i, j, N, 1));
                    uf.union(getIndex(i, j, N, 2), getIndex(i, j, N ,3));
                }
                
                if (symbol != '\\') {
                    uf.union(getIndex(i, j, N, 0), getIndex(i, j, N, 3));
                    uf.union(getIndex(i, j, N, 1), getIndex(i, j, N, 2));
                }
            }
        }
        
        return uf.query();
    }
    
    private int getIndex(int i, int j, int N, int k) {
        return (i * N + j) * 4 + k;
    }
}

class UnionFind {
    int[] father;
    private int count;
    
    UnionFind(int n) {
        this.father = new int[n];
        this.count = n;
        for (int i = 0; i < n; i++) {
            father[i] = i;
        }
    }
    
    void union(int a, int b) {
        int root_a = find(a);
        int root_b = find(b);
        if (root_a != root_b) {
            father[root_a] = root_b;
            count--;
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
    
    int query() {
        return this.count;
    }
}