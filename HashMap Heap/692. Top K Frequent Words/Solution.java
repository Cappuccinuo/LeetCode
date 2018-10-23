// O(nlogk) time + O(n) space
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> result = new LinkedList<>();
        
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        
        PriorityQueue<String> pq = new PriorityQueue<>(k, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (map.get(s1) == map.get(s2)) {
                    return s2.compareTo(s1);
                }
                return map.get(s1) - map.get(s2);
            }
        });
        
        for (String key : map.keySet()) {
            pq.offer(key);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        while (!pq.isEmpty()) {
            result.add(0, pq.poll());
        }
        
        return result;
    }
}

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