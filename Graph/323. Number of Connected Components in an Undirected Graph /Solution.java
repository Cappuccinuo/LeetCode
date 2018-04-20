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




class Solution {
    public int countComponents(int n, int[][] edges) {
        int row = edges.length;
        
        if (edges == null || row == 0 || n == 0) {
            return n;
        }
        
        List<List<Integer>> adjList = getAdjList(n, edges);
        
        boolean[] visited = new boolean[n];
        
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                dfs(i, adjList, visited);
            }
        }
        return count;
    }
    
    private List<List<Integer>> getAdjList(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        
        for (int[] edge : edges) {
            int source = edge[0];
            int destination = edge[1];
            adjList.get(source).add(destination);
            adjList.get(destination).add(source);
        }
        
        return adjList;
    }
    
    private void dfs(int start, List<List<Integer>> adjList, boolean[] visited) {
        visited[start] = true;
        List<Integer> neighbors = adjList.get(start);
        for (int neighbor : neighbors) {
            if (!visited[neighbor]) {
                dfs(neighbor, adjList, visited);
            }
        }
    }
}



class Solution {
    public int countComponents(int n, int[][] edges) {
        int row = edges.length;
        if (n == 0 || row == 0 || edges == null) {
            return n;
        }
        
        List<List<Integer>> adjList = getAdjList(n, edges);
        
        boolean[] visited = new boolean[n];
        
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                bfs(i, adjList, visited);
            }
        }
        return count;
    }
    
    private void bfs(int start, List<List<Integer>> adjList, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        while (!queue.isEmpty()) {
            int front = queue.poll();
            visited[front] = true;
            List<Integer> neighbors = adjList.get(front);
            for (int neighbor : neighbors) {
                if (!visited[neighbor]) {
                    queue.offer(neighbor);
                }
            }
        }
    }
    
    private List<List<Integer>> getAdjList(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        
        for (int[] edge : edges) {
            int source = edge[0];
            int destination = edge[1];
            adjList.get(source).add(destination);
            adjList.get(destination).add(source);
        }
        return adjList;
    }
}