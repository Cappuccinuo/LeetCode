class Solution {
    public int[][] highFive(int[][] items) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for (int[] item : items) {
            if (!map.containsKey(item[0])) {
                map.put(item[0], new PriorityQueue<Integer>());
            }
            map.get(item[0]).offer(item[1]);
            if (map.get(item[0]).size() > 5) {
                map.get(item[0]).poll();
            }
        }
        int[][] result = new int[map.size()][2];
        int index = 0;
        for (int id : map.keySet()) {
            result[index][0] = id;
            result[index][1] = getAverage(map.get(id));
            index++;
        }
        return result;
    }
    
    private int getAverage(PriorityQueue<Integer> pq) {
        int sum = 0;
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }
        return sum / 5;
    }
}