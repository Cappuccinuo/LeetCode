// Use Union Find, every time we check the edge, we judge if they are already connected
// As the tree will not have cycle
// At last, we need to check if the n edges have just one union, as tree nodes are all connected
class Solution {
    UnionFind uf;
    public boolean validTree(int n, int[][] edges) {
        uf = new UnionFind(n);
        
        for (int[] edge : edges) {
            int first = edge[0];
            int second = edge[1];
            if (uf.find(first) == uf.find(second)) {
                return false;
            }
            uf.union(first, second);
        }
        
        return uf.count == 1;
    }
    
    class UnionFind {
        int[] father;
        int count;
        
        UnionFind(int n) {
            father = new int[n];
            for (int i = 0; i < n; i++) {
                father[i] = i;
            }
            count = n;
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
    }
}

// We can also use BFS to see if every node is reachable, 
// For a graph, if it is a tree, it must have n - 1 edge,
// and every node can be travesed based on n - 1 edge
class Solution {
    public boolean validTree(int n, int[][] edges) {
        if (edges.length != n - 1) {
            return false;
        }
        Map<Integer, Set<Integer>> graph = getInitialGraph(n, edges);
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet();
        queue.offer(0);
        visited.add(0);
        
        while (!queue.isEmpty()) {
            int front = queue.poll();
            for (int neighbour : graph.get(front)) {
                if (visited.contains(neighbour)) {
                    continue;
                }
                queue.offer(neighbour);
                visited.add(neighbour);
            }
        }
        
        return visited.size() == n;
    }
    
    private Map<Integer, Set<Integer>> getInitialGraph(int n, int[][] edges) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new HashSet());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        return graph;
    }
}

// DFS
class Solution {
    public boolean validTree(int n, int[][] edges) {
        if (edges.length != n - 1) {
            return false;
        }
        Map<Integer, List<Integer>> graph = new HashMap<>();
        int i;
        for (i = 0; i < n; i++) {
            graph.put(i, new LinkedList<>());
        }
        for (int[] edge : edges) {
            int src = edge[0];
            int dst = edge[1];
            graph.get(src).add(dst);
            graph.get(dst).add(src);
        }
        
        Set<Integer> visited = new HashSet();
        visited.add(0);
        DFS(graph, visited, 0);
        
        return visited.size() == n;
    }
    
    private void DFS(Map<Integer, List<Integer>> graph, Set<Integer> visited, int node) {
        for (int neighbour : graph.get(node)) {
            if (visited.contains(neighbour)) {
                continue;
            }
            visited.add(neighbour);
            DFS(graph, visited, neighbour);
        }
    }
}

class Solution {
    public boolean validTree(int n, int[][] edges) {
        if (edges.length != n - 1) {
            return false;
        }
        Map<Integer, List<Integer>> graph = new HashMap<>();
        int i;
        for (i = 0; i < n; i++) {
            graph.put(i, new LinkedList<>());
        }
        for (int[] edge : edges) {
            int src = edge[0];
            int dst = edge[1];
            graph.get(src).add(dst);
            graph.get(dst).add(src);
        }
        
        Set<Integer> visited = new HashSet();

        if (hasCycle(graph, visited, 0, -1)) {
            return false;
        }
        
        return visited.size() == n;
    }
    
    private boolean hasCycle(Map<Integer, List<Integer>> graph, Set<Integer> visited, int node, int parent) {
        visited.add(node);
        
        for (int neighbour : graph.get(node)) {
            // The recursion is not from the neighbour itself, like 2 - 3, we recursion on 3, 2 is also the 
            // neighbour of 3
            if (visited.contains(neighbour) && parent != neighbour) {
                return true;
            }
            if (!visited.contains(neighbour) && hasCycle(graph, visited, neighbour, node)) {
                return true;
            }
        }
        
        return false;
    }
}