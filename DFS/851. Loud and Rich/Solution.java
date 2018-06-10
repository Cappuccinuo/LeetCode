class Solution {
    ArrayList<Integer>[] graph;
    int[] answer;
    int[] quiet;
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        this.quiet = quiet;
        int len = quiet.length;
        answer = new int[len];
        graph = new ArrayList[len];
        for (int i = 0; i < len; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        for (int[] edge : richer) {
            graph[edge[1]].add(edge[0]);
        }
        
        Arrays.fill(answer, -1);
        for (int i = 0; i < len; i++) {
            dfs(i);
        }
        return answer;
    }
    
    private int dfs(int node) {
        if (answer[node] == -1) {
            answer[node] = node;
            for (int child : graph[node]) {
                int candidate = dfs(child);
                if (quiet[candidate] < quiet[answer[node]]) {
                    answer[node] = candidate;
                }
            }
        }
        return answer[node];
    }
}