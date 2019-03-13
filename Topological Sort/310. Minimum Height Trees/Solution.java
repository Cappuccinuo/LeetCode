class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> result = new LinkedList<>();
        if (n == 1) {
            result.add(0);
            return result;
        }
        Map<Integer, List<Integer>> graph = new HashMap<>();
        int i;
        int[] indegree = new int[n];
        for (i = 0; i < n; i++) {
            graph.put(i, new LinkedList<>());
        }
        for (int[] edge : edges) {
            int e1 = edge[0];
            int e2 = edge[1];
            indegree[e1]++;
            indegree[e2]++;
            graph.get(e1).add(e2);
            graph.get(e2).add(e1);
        }
        
        Queue<Integer> queue = new LinkedList<>();
        for (i = 0; i < n; i++) {
            if (indegree[i] == 1) {
                queue.offer(i);
            }
        }
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            result = new LinkedList<>();
            for (i = 0; i < size; i++) {
                int node = queue.poll();
                indegree[node]--;
                result.add(node);
                for (int neighbour : graph.get(node)) {
                    if (indegree[neighbour] == 0) {
                        continue;
                    }
                    indegree[neighbour]--;
                    if (indegree[neighbour] == 1) {
                        queue.offer(neighbour);
                    }
                }
            }
        }
        
        return result;
    }
}