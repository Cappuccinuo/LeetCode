class Solution {
    public boolean wordPatternMatch(String pattern, String str) {
        Map<Character, String> map = new HashMap<>();
        Set<String> visited = new HashSet();
        return DFS(pattern, str, map, visited);
    }
    
    private boolean DFS(String pattern, String str, Map<Character, String> map, Set<String> visited) {
        if (pattern.length() == 0) {
            return str.length() == 0;
        }
        
        char symbol = pattern.charAt(0);
        if (map.containsKey(symbol)) {
            String s = map.get(symbol);
            if (!str.startsWith(s)) {
                return false;
            }
            return DFS(pattern.substring(1), str.substring(map.get(symbol).length()), map, visited);
        }
        
        for (int i = 0; i < str.length(); i++) {
            String s = str.substring(0, i + 1);
            if (visited.contains(s)) {
                continue;
            }
            map.put(symbol, s);
            visited.add(s);
            if (DFS(pattern.substring(1), str.substring(i + 1), map, visited)) {
                return true;
            }
            map.remove(symbol);
            visited.remove(s);
        }
        return false;
    }
}