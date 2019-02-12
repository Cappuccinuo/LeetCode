class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        UnionFind uf = new UnionFind(edges.length);
        int[] result = new int[2];
        int p1 = -1;
        int p2 = -1;

        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            int component = uf.query();
            uf.union(edge[0] - 1, edge[1] - 1);
            if (component == uf.query()) {
                result[0] = edge[0];
                result[1] = edge[1];
                return result;
            }
        }
      
        return result;
    }
}

class UnionFind {
    int[] father;
    int count;
    
    UnionFind(int N) {
        this.father = new int[N];
        for (int i = 0; i < N; i++) {
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
        return this.count;
    }
}