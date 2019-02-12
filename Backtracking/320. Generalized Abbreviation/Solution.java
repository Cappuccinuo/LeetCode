class Solution {
    public List<String> generateAbbreviations(String word) {
        List<String> result = new LinkedList<>();
        DFS(word, "", 0, 0, result);
        return result;
    }
    
    private void DFS(String word, String current, int count, int index, List<String> result) {
        if (index == word.length()) {
            if (count != 0) {
                current += count;
            }
            result.add(current);
            return;
        }
        
        DFS(word, current + (count == 0 ? "" : count) + word.charAt(index), 0, index + 1, result);
        DFS(word, current, count + 1, index + 1, result);
    }
}