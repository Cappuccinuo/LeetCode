// 2018.4.11
class Solution {
    Map<Character, Integer> frequencyMap;
    public String frequencySort(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        frequencyMap = new HashMap<>();
        calculateFrequency(s, frequencyMap);
        
        PriorityQueue<Character> pq = new PriorityQueue<>(s.length(), new frequencyComparator());
        for (char c : frequencyMap.keySet()) {
            pq.offer(c);
        }
        
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            char c = pq.poll();
            int count = frequencyMap.get(c);
            for (int i = 0; i < count; i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
    private void calculateFrequency(String s, Map<Character, Integer> frequencyMap) {
        char[] array = s.toCharArray();
        for (char c : array) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
    }
    
    class frequencyComparator implements Comparator<Character> {
        @Override
        public int compare(Character c1, Character c2) {
            return frequencyMap.get(c2) - frequencyMap.get(c1);
        }
    }
}

class Solution {
    public String frequencySort(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        Map<Character, Integer> frequencyMap = new HashMap<>();
        char[] letters = s.toCharArray();
        for (char letter : letters) {
            frequencyMap.put(letter, frequencyMap.getOrDefault(letter, 0) + 1);
        }
        List<Character>[] bucket = new List[s.length() + 1];
        for (char c : frequencyMap.keySet()) {
            int freq = frequencyMap.get(c);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(c);
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = s.length(); i >= 0; i--) {
            if (bucket[i] != null) {
                for (char c : bucket[i]) {
                    for (int j = 0; j < frequencyMap.get(c); j++) {
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}