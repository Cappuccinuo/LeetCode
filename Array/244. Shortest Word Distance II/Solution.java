class WordDistance {
    Map<String, List<Integer>> map;
    public WordDistance(String[] words) {
        map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                map.get(words[i]).add(i);
            }
            else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(words[i], list);
            }
        }
    }
    
    public int shortest(String word1, String word2) {
        List<Integer> word1List = map.get(word1);
        List<Integer> word2List = map.get(word2);
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0, j = 0; i < word1List.size() && j < word2List.size();) {
            int index1 = word1List.get(i);
            int index2 = word2List.get(j);
            if (index1 < index2) {
                minDistance = Math.min(minDistance, index2 - index1);
                i++;
            }
            else {
                minDistance = Math.min(minDistance, index1 - index2);
                j++;
            }
        }
        return minDistance;
    }
}

/**
 * Your WordDistance object will be instantiated and called as such:
 * WordDistance obj = new WordDistance(words);
 * int param_1 = obj.shortest(word1,word2);
 */