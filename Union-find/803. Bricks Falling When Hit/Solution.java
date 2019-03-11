class Solution {
    int[][] directions = new int[][]{{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
    int row;
    int col;
    public int[] hitBricks(int[][] grid, int[][] hits) {
        row = grid.length;
        col = grid[0].length;
        int N = row * col;
        UnionFind uf = new UnionFind(N + 1);
        
        int i, j, x, y;
        int hitLen = hits.length;
        for (i = 0; i < hitLen; i++) {
            int[] hit = hits[i];
            x = hit[0];
            y = hit[1];
            if (grid[x][y] == 1) {
                grid[x][y] = 2;
            }
        }
        
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    unionAround(uf, i, j, grid);
                }
            }
        }
        
        int[] result = new int[hitLen];
        int current = uf.size[uf.find(0)];

        for (i = hitLen - 1; i >= 0; i--) {
            int[] hit = hits[i];
            x = hit[0];
            y = hit[1];
            if (grid[x][y] == 2) {
                grid[x][y] = 1;
                unionAround(uf, x, y, grid);
            }
            
            result[i] = uf.size[uf.find(0)] == current ? 0 : uf.size[uf.find(0)] - current - 1;
            current = uf.size[uf.find(0)];
        }
        
        return result;
    }
    
    private void unionAround(UnionFind uf, int i, int j, int[][] grid) {
        int originIndex = getIndex(i, j);
        for (int[] direction : directions) {
            int x = i + direction[0];
            int y = j + direction[1];
            if (!inBound(x, y)) {
                continue;
            }
            if (grid[x][y] != 1) {
                continue;
            }
            int ind = getIndex(x, y);
            uf.union(ind, originIndex);
        }
        
        if (i == 0) {
            uf.union(originIndex, 0);
        }
    }
    
    private boolean inBound(int i, int j) {
        return i >= 0 && i < row && j >= 0 && j < col;
    }
    
    private int getIndex(int i, int j) {
        return i * col + j + 1;
    }
}

class UnionFind {
    int[] father;
    int[] size;
    
    UnionFind(int N) {
        this.father = new int[N];
        for (int i = 0; i < N; i++) {
            father[i] = i;
        }
        this.size = new int[N];
        for (int i = 0; i < N; i++) {
            size[i] = 1;
        }
    }
    
    void union(int a, int b) {
        int root_a = find(a);
        int root_b = find(b);
        if (root_a != root_b) {
            father[root_a] = root_b;
            size[root_b] += size[root_a];
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