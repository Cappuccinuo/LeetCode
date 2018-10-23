class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        
        PriorityQueue<String> pq = new PriorityQueue<>(
            (o1, o2) -> (map.get(o1) == map.get(o2) ? o2.compareTo(o1) : map.get(o1) - map.get(o2)));
        for (String s : map.keySet()) {
            pq.add(s);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        List<String> result = new LinkedList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }
        Collections.reverse(result);
        return result;
    }
}