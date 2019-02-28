class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new LinkedList<>();
        for (String word : words) {
            if (canform(word, pattern)) {
                result.add(word);
            }
        }
        return result;
    }
    
    private boolean canform(String word, String pattern) {
        if (word.length() != pattern.length()) {
            return false;
        }
        
        Map<Character, Character> map = new HashMap<>();
        char[] letters = word.toCharArray();
        char[] symbols = pattern.toCharArray();
        int i;
        for (i = 0; i < letters.length; i++) {
            char letter = letters[i];
            char symbol = symbols[i];
            if (map.containsKey(symbol) && map.get(symbol) != letter) {
                return false;
            }
            if (map.containsValue(letter) && !map.containsKey(symbol)) {
                return false;
            }
            map.put(symbol, letter);
        }
        return true;
    }
}