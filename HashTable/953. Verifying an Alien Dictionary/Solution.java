class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] order = new int[26];
        int count = 0;
        for (char c : order.toCharArray()) {
            order[count++] = c
        }
        
        for (int i = 0; i < words.length - 1; i++) {
            if (!verifyOrder(words[i], words[i + 1], map)) {
                return false;
            }
        }
        return true;
    }
    
    private boolean verifyOrder(String word1, String word2, Map<Character, Integer> map) {
        int index = 0;
        while (index < word1.length() && index < word2.length()) {
            char a = word1.charAt(index);
            char b = word2.charAt(index);
            if (a == b) {
                index++;
                continue;
            }
            else {
                if (map.get(a) < map.get(b)) {
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        
        if (index == word1.length() && index != word2.length()) {
            return true;
        }
        
        if (index == word2.length() && index != word1.length()) {
            return false;
        }
        
        return true;
    }
}