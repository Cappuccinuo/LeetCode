class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        for (int[] flight : flights) {
            if (!graph.containsKey(flight[0])) {
                graph.put(flight[0], new ArrayList<>());
            }
            graph.get(flight[0]).add(new int[]{flight[1], flight[2]});
        }
        // Price, Destination, Stop
        pq.offer(new int[]{0, src, K + 1});
        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int price = top[0];
            int station = top[1];
            int stop = top[2];

            if (station == dst) {
                return price;
            }

            if (stop > 0) {
                if (!graph.containsKey(station)) {
                    continue;
                }
                for (int[] neighbour : graph.get(station)) {
                    int nstation = neighbour[0];
                    int nprice = neighbour[1];
                    pq.offer(new int[]{nprice + price, nstation, stop - 1});
                }
            }
        }
        
        return -1;
    }
}