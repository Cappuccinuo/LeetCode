class Solution {
    int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public List<Integer> numIslands2(int m, int n, int[][] positions) {
        List<Integer> res = new LinkedList<>();
        UnionFind uf = new UnionFind(m * n);
        boolean[][] island = new boolean[m][n];
        int count = 0;
        for (int[] position : positions) {
            int x = position[0];
            int y = position[1];
            int index0 = getIndex(x, y, n);
            int root0 = uf.find(index0);
            if (!island[x][y]) {
                island[x][y] = true;
                count++;
                for (int[] direction : directions) {
                    int new_x = x + direction[0];
                    int new_y = y + direction[1];
                    if (!inBound(new_x, new_y, m, n)) {
                        continue;
                    }
                    if (!island[new_x][new_y]) {
                        continue;
                    }
                    int index = getIndex(new_x, new_y, n);
                    int root = uf.find(index);
                    if (root0 != root) {
                        count--;
                        uf.union(root, root0);
                    }
                }
            }
            res.add(count);
        }
        return res;
    }
    
    private boolean inBound(int x, int y, int m, int n) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }
    
    private int getIndex(int x, int y, int n) {
        return x * n + y;
    }
}

class UnionFind {
    int[] father;
    
    UnionFind(int N) {
        this.father = new int[N];
        for (int i = 0; i < N; i++) {
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