class Solution {
    public int networkDelayTime(int[][] times, int N, int K) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        Map<Integer, Integer> dist = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        for (int[] t : times) {
            int source = t[0];
            int target = t[1];
            int time = t[2];
            if (!graph.containsKey(source)) {
                graph.put(source, new ArrayList<>());
            }
            graph.get(source).add(new int[]{time, target});
        }
        
        pq.offer(new int[]{0, K});
        
        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int time = top[0];
            int target = top[1];
            
            if (dist.containsKey(target)) {
                continue;
            }
            
            dist.put(target, time);
            
            if (graph.containsKey(target)) {
                for (int[] neighbour : graph.get(target)) {
                    int ntime = neighbour[0];
                    int ntarget = neighbour[1];
                    if (!dist.containsKey(ntarget)) {
                        pq.offer(new int[]{ntime + time, ntarget});
                    }
                }
            }
        }
        
        if (dist.size() != N) {
            return -1;
        }
        
        int result = 0;
        
        for (int i = 1; i <= N; i++) {
            if (dist.containsKey(i)) {
                result = Math.max(result, dist.get(i));
            }
        }
        
        return result;
    }
}

class Solution {
    public int networkDelayTime(int[][] times, int N, int K) {
        Map<Integer, Integer> dist = new HashMap<>();
        Map<Integer, List<int[]>> graph = new HashMap<>();
        
        for (int[] time : times) {
            if (!graph.containsKey(time[0])) {
                graph.put(time[0], new ArrayList<>());
            }
            graph.get(time[0]).add(new int[]{time[1], time[2]});
        }
        
        boolean[] seen = new boolean[N + 1];
        for (int i = 1; i <= N; i++) {
            dist.put(i, Integer.MAX_VALUE);
        }
        dist.put(K, 0);
        
        while (true) {
            int node = -1;
            int dis = Integer.MAX_VALUE;
            
            for (int i = 1; i <= N; i++) {
                if (!seen[i] && dist.get(i) < dis) {
                    node = i;
                    dis = dist.get(i);
                }
            }
            
            if (node < 0) {
                break;
            }
            
            seen[node] = true;
            
            if (graph.containsKey(node)) {
                for (int[] time : graph.get(node)) {
                    dist.put(time[0], Math.min(dist.get(time[0]), time[1] + dist.get(node)));
                }
            }
        }
        
        int result = 0;
        for (int d : dist.values()) {
            result = Math.max(d, result);
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}