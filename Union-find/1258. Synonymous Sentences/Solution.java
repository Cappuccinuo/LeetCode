// UnionFind Solution 6ms
class Solution {
    public List<String> generateSentences(List<List<String>> synonyms, String text) {
        Set<String> result = new TreeSet<>();
        UnionFind uf = new UnionFind();
        Map<String, Set<String>> mapping = getUnionFindRootMapping(uf, synonyms);
        String[] words = text.split("\\s+");
        backtracking(mapping, result, words, 0, "", uf);
        return new LinkedList<>(result);
    }
    
    private Map<String, Set<String>> getUnionFindRootMapping(UnionFind uf, List<List<String>> synonyms) {
        for (List<String> synonym : synonyms) {
            uf.union(synonym.get(0), synonym.get(1));
        }
        return uf.mapping;
    }
    
    private void backtracking(Map<String, Set<String>> map, 
                              Set<String> result, 
                              String[] words, 
                              int index, 
                              String current, 
                              UnionFind uf) {
        if (words.length == index) {
            result.add(current.trim());
            return;
        }
        
        String word = words[index];
        String root = uf.find(word);
        if (!map.containsKey(root)) {
            backtracking(map, result, words, index + 1, current + word + " ", uf);
        }
        else {
            for (String synonym : map.get(root)) {
                backtracking(map, result, words, index + 1, current + synonym + " ", uf);
            }
        }
    }
}

class UnionFind {
    Map<String, String> father;
    Map<String, Set<String>> mapping;
    
    UnionFind() {
        this.father = new HashMap<>();
        this.mapping = new HashMap<>();
    }
    
    void union(String a, String b) {
        String root_a;
        if (father.containsKey(a)) {
            root_a = find(a);
        }
        else {
            root_a = a;
            father.put(a, a);
        }
        String root_b;
        if (father.containsKey(b)) {
            root_b = find(b);
        }
        else {
            root_b = b;
            father.put(b, b);
        }
        if (!root_a.equals(root_b)) {
            father.put(root_a, root_b);
            if (!mapping.containsKey(root_b)) {
                mapping.put(root_b, new HashSet());
                mapping.get(root_b).add(root_b);
            }
            mapping.get(root_b).add(root_a);
            mapping.get(root_b).addAll(mapping.getOrDefault(root_a, new HashSet()));
        }
    }
    
    String find(String x) {
        if (!father.containsKey(x)) {
            return x;
        }
        if (father.get(x).equals(x)) {
            return x;
        }
        Stack<String> stack = new Stack<>();
        while (!father.get(x).equals(x)) {
            stack.push(x);
            x = father.get(x);
        }
        while (!stack.isEmpty()) {
            String top = stack.pop();
            father.put(top, x);
            mapping.get(x).add(top);
        }
        return x;
    }
}

// Map Solution 6ms
class Solution {
    public List<String> generateSentences(List<List<String>> synonyms, String text) {
        Set<String> result = new TreeSet<>();
        Map<String, List<String>> map = createSynonymMap(synonyms);
        String[] words = text.split("\\s+");
        backtracking(map, result, words, 0, "");
        return new LinkedList<>(result);
    }
    
    private void backtracking(Map<String, List<String>> map, Set<String> result, String[] words, int index, String current) {
        if (words.length == index) {
            result.add(current.trim());
            return;
        }
        
        String word = words[index];
        if (!map.containsKey(word)) {
            backtracking(map, result, words, index + 1, current + word + " ");
        }
        else {
            List<String> synonyms = map.get(word);
            for (String synonym : synonyms) {
                backtracking(map, result, words, index + 1, current + synonym + " ");
            }
        }
    }
    
    private Map<String, List<String>> createSynonymMap(List<List<String>> synonyms) {
        Map<String, List<String>> map = new HashMap<>();
        for (List<String> synonym : synonyms) {
            String word1 = synonym.get(0);
            String word2 = synonym.get(1);
            if (!map.containsKey(word1)) {
                map.put(word1, new LinkedList<>());
                map.get(word1).add(word1);
            }

            if (!map.containsKey(word2)) {
                map.put(word2, new LinkedList<>());
                map.get(word2).add(word2);
            }
            map.get(word1).add(word2);
            map.get(word2).add(word1);
            for (String key : map.get(word1)) {
                if (!key.equals(word1)) {
                    map.get(key).add(word2);
                }
            }
            for (String key : map.get(word2)) {
                if (!key.equals(word2)) {
                    map.get(key).add(word1);
                }
            }
        }
        return map;
    }
}

