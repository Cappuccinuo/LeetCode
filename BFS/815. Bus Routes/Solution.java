class Solution {
    Map<Integer, List<Integer>> graph;   // Key : bus stop, Value : list of route number
    Set<Integer> visitedRoute;  // Route Number
    
    public int numBusesToDestination(int[][] routes, int S, int T) {
        if (S == T) {
            return 0;
        }
        graph = new HashMap<>();
        constructGraph(routes);
        visitedRoute = new HashSet();
        return BFS(routes, S, T);
    }
    
    private int BFS(int[][] routes, int S, int T) {
        Queue<Integer> queue = new LinkedList<>(); // Store bus stop
        queue.offer(S);
        int step = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int bus = queue.poll();
                
                for (int r : graph.get(bus)) {
                    if (visitedRoute.contains(r)) {
                        continue;
                    }
                    visitedRoute.add(r);
                    for (int s : routes[r]) {
                        if (s == T) {
                            return step;
                        }
                        queue.offer(s);
                    }
                }
            }
            step++;
        }
        return -1;
    }
    
    private void constructGraph(int[][] routes) {
        for (int i = 0; i < routes.length; i++) {
            for (int j = 0; j < routes[i].length; j++) {
                if (!graph.containsKey(routes[i][j])) {
                    graph.put(routes[i][j], new LinkedList<>());
                }
                graph.get(routes[i][j]).add(i);
            }
        }
    }
}