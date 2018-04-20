// 2018.4.20
class Solution {
    public int countComponents(int n, int[][] edges) {
        int row = edges.length;
        if (edges == null || row == 0 || n == 0) {
            return n;
        }
        int col = edges[0].length;
        
        UnionFind uf = new UnionFind(n);
        uf.setCount(n);
        for (int i = 0; i < row; i++) {
            uf.union(edges[i][0], edges[i][1]);
        }
        return uf.queryCount();
    }
}

class UnionFind {
    int[] father;
    int count;
    
    UnionFind(int n) {
        father = new int[n];
        for (int i = 0; i < n; i++) {
            father[i] = i;
        }
    }
    
    int find(int x) {
        if (father[x] == x) {
            return x;
        }
        return find(father[x]);
    }
    
    void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP != rootQ) {
            father[rootP] = rootQ;
            count--;
        }
    }
    
    void setCount(int x) {
        count = x;
    }
    
    int queryCount() {
        return count;
    }
}