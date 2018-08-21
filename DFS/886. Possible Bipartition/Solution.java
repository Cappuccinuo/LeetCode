class Solution {
    ArrayList<Integer>[] graph;
    Map<Integer, Integer> color;
    
    public boolean possibleBipartition(int N, int[][] dislikes) {
        graph = new ArrayList[N + 1];
        
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int[] dislike : dislikes) {
            graph[dislike[0]].add(dislike[1]);
            graph[dislike[1]].add(dislike[0]);
        }
        
        color = new HashMap();
        
        for (int i = 1; i <= N; i++) {
            if (!color.containsKey(i) && !dfs(i, 0)) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean dfs(int n, int c) {
        if (color.containsKey(n)) {
            return color.get(n) == c;
        }
        
        color.put(n, c);
        
        for (int neighbor : graph[n]) {
            if (!dfs(neighbor, c ^ 1)) {
                return false;
            }
        }
        
        return true;
    }
}