class Solution {
    public int removeStones(int[][] stones) {
        Map<Integer, Integer> rows = new HashMap<>();
        Map<Integer, Integer> cols = new HashMap<>();
        int N = stones.length;
        UnionFind uf = new UnionFind(N);
        int i; 
        for (i = 0; i < N; i++) {
            int[] stone = stones[i];
            int x = stone[0];
            int y = stone[1];
            if (!rows.containsKey(x)) {
                rows.put(x, i);
            }
            else {
                uf.union(rows.get(x), i);
            }
            if (!cols.containsKey(y)) {
                cols.put(y, i);
            }
            else {
                uf.union(cols.get(y), i);
            }   
        }
        
        return N - uf.query();
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
        return count;
    }
}