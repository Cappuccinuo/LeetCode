class Solution {
    public int numTilePossibilities(String tiles) {
        Set<String> set = new HashSet();
        char[] letters = tiles.toCharArray();
        int len = letters.length;
        boolean[] visited = new boolean[len];
        backtracking(letters, 0, set, visited, "");
        return set.size() - 1;
    }
    
    private void backtracking(char[] letters, int index, Set<String> set, boolean[] visited, String current) {
        if (index <= letters.length) {
            set.add(current);
        }
        
        int i;
        for (i = 0; i < letters.length; i++) {
            if (visited[i]) {
                continue;
            }
            current = current + letters[i];
            visited[i] = true;
            backtracking(letters, i + 1, set, visited, current);
            current = current.substring(0, current.length() - 1);
            visited[i] = false;
        }
    }
}