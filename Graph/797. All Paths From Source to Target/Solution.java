class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new LinkedList<>();
        
        int N = graph.length;
        boolean[] visited = new boolean[N];
        List<Integer> path = new LinkedList<>();
        path.add(0);
        visited[0] = true;
        DFS(graph, result, path, visited, 0, N - 1);
        return result;
    }
    
    private void DFS(int[][] graph, List<List<Integer>> result, List<Integer> path, boolean[] visited, int start, int end) {
        if (start == end) {
            result.add(new LinkedList<>(path));
            return;
        }
        for (int neighbour : graph[start]) {
            if (!visited[neighbour]) {
                path.add(neighbour);
                visited[neighbour] = true;
                DFS(graph, result, path, visited, neighbour, end);
                path.remove(path.size() - 1);
                visited[neighbour] = false;
            }
        }
    }
}