class Solution {
    public int minSwapsCouples(int[] row) {
        int len = row.length;
        UnionFind uf = new UnionFind(len);
        int N = len / 2;
        int i = 0;
        for (i = 0; i < len; i += 2) {
            int a = row[i];
            int b = row[i + 1];
            uf.union(a, b);
            uf.union(a, a % 2 == 0 ? a + 1 : a - 1);
            uf.union(b, b % 2 == 0 ? b + 1 : b - 1);
        }
        return N - uf.query();
    }
}

class UnionFind {
    int[] father;
    int count;
    
    UnionFind(int N) {
        this.father = new int[N];
        count = N;
        for (int i = 0; i < N; i++) {
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