class Solution {
    public List<Integer> grayCode(int n) {
        int N = (int)Math.pow(2, n);
        List<Integer> result = new LinkedList<>();
        result.add(0);
        boolean[] visited = new boolean[N];
        visited[0] = true;
        DFS(n, result, visited, 0, N);
        return result;
    }
    
    private void DFS(int n, List<Integer> current, boolean[] visited, int prev, int size) {
        if (current.size() == size) {
            return;
        }
        
        int i;
        for (i = 0; i < n; i++) {
            int mask = 1 << i;
            int next = prev ^ mask;
            if (!visited[next]) {
                current.add(next);
                visited[next] = true;
                DFS(n, current, visited, next, size);
                if (current.size() == size) {
                    return;
                }
                current.remove(current.size() - 1);
                visited[next] = false;
            }
        }
    }
}