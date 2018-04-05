// 2018.4.4 Union-find
class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;
        UnionFind uf = new UnionFind(row * col);
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    count++;
                }
            }
        }
        uf.set_count(count);
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    if (i > 0 && grid[i - 1][j] == '1') {
                        uf.union(i * col + j, (i - 1) * col + j);
                    } 
                    if (i < row - 1 && grid[i + 1][j] == '1') {
                        uf.union(i * col + j, (i + 1) * col + j);
                    }
                    if (j > 0 && grid[i][j - 1] == '1') {
                        uf.union(i * col + j, i * col + j - 1);
                    }
                    if (j < col - 1 && grid[i][j + 1] == '1') {
                        uf.union(i * col + j, i * col + j + 1);
                    }
                }
            }
        }
        return uf.query();
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
    
    void union(int a, int b) {
        int root_a = find(a);
        int root_b = find(b);
        if (root_a != root_b) {
            father[root_a] = root_b;
            count--;
        }
    }
    
    void set_count(int total) {
        count = total;
    }
    
    int query() {
        return count;
    }
}