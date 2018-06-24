class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> result = new LinkedList<>();
        Set<String> dictionary = new HashSet(wordList);
        if (!dictionary.contains(endWord)) {
            return result;
        }
        dictionary.add(beginWord);
        
        Map<String, List<String>> map = new HashMap<>();
        Map<String, Integer> distance = new HashMap<>();
        
        bfs(beginWord, map, distance, dictionary);
        
        List<String> path = new LinkedList<>();
        dfs(result, path, endWord, beginWord, map, distance);
        return result;
    }
    
    private void dfs(List<List<String>> result,
                    List<String> path,
                    String current,
                    String beginWord,
                    Map<String, List<String>> map,
                    Map<String, Integer> distance) {
        path.add(current);
        if (current.equals(beginWord)) {
            Collections.reverse(path);
            result.add(new LinkedList<>(path));
            Collections.reverse(path);
        }
        else {
            for (String next : map.get(current)) {
                if (distance.containsKey(next) && distance.get(next) + 1 == distance.get(current)) {
                    dfs(result, path, next, beginWord, map, distance);
                }
            }
        }
        path.remove(path.size() - 1);
    }
    
    private void bfs(String beginWord, 
                     Map<String, List<String>> map, 
                     Map<String, Integer> distance, 
                     Set<String> dictionary) {
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        distance.put(beginWord, 0);
        
        for (String word : dictionary) {
            map.put(word, new LinkedList<>());
        }
        
        while (!queue.isEmpty()) {
            String front = queue.poll();
            
            for (String neighbour : getNextWords(front, dictionary)) {
                map.get(front).add(neighbour);
                if (!distance.containsKey(neighbour)) {
                    distance.put(neighbour, distance.get(front) + 1);
                    queue.offer(neighbour);
                }
            }
        }
    }
    
    private List<String> getNextWords(String word, Set<String> dictionary) {
        List<String> nextWords = new LinkedList<>();
        
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            for (char c = 'a'; c <= 'z'; c++) {
                if (c == current) {
                    continue;
                }
                String nextWord = word.substring(0, i) + c + word.substring(i + 1);
                if (dictionary.contains(nextWord)) {
                    nextWords.add(nextWord);
                }
            }
        }
        
        return nextWords;
    }
}