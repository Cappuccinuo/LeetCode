class Solution {
    public int minimumCost(int N, int[][] connections) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> a[2] - b[2]);
        
        for (int[] connection : connections) {
            if (!graph.containsKey(connection[0])) {
                graph.put(connection[0], new LinkedList<>());
            }
            if (!graph.containsKey(connection[1])) {
                graph.put(connection[1], new LinkedList<>());
            }
            graph.get(connection[0]).add(new int[]{connection[1], connection[2]});
            graph.get(connection[1]).add(new int[]{connection[0], connection[2]});
        }
        
        Set<Integer> visited = new HashSet();
        pq.offer(new int[]{1, 1, 0});
        
        int costs = 0;
        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int start = top[0];
            int end = top[1];
            int cost = top[2];
            
            if (!visited.contains(end)) {
                costs += cost;
                visited.add(end);
                for (int[] neighbour : graph.get(end)) {
                    pq.offer(new int[]{end, neighbour[0], neighbour[1]});
                }
            }
        }
        return visited.size() == N ? costs : -1;
    }
}