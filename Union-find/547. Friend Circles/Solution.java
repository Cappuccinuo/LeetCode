class Solution {
    public int findCircleNum(int[][] M) {
        int N = M.length;
        UnionFind uf = new UnionFind(N);
        int i, j;
        for (i = 0; i < N; i++) {
            for (j = i + 1; j < N; j++) {
                if (M[i][j] == 1) {
                    uf.union(i, j);
                }
            }
        }
        return uf.query();
    }
}

class UnionFind {
    int[] father;
    int count;
    UnionFind(int N) {
        this.father = new int[N];
        int i;
        for (i = 0; i < N; i++) {
            father[i] = i;
        }
        this.count = N;
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
        return count;
    }
}