class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new LinkedList<>();
        for (String word : words) {
            if (matchThePattern(word, pattern)) {
                result.add(word);
            }
        }
        return result;
    }
    
    private boolean matchThePattern(String word, String pattern) {
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        char[] wordArr = word.toCharArray();
        char[] patternArr = pattern.toCharArray();
        
        for (int i = 0; i < wordArr.length; i++) {
            if (map.containsKey(wordArr[i]) && map.get(wordArr[i]) != patternArr[i] 
                || map2.containsKey(patternArr[i]) && map2.get(patternArr[i]) != wordArr[i]) {
                return false;
            }
            map.put(wordArr[i], patternArr[i]);
            map2.put(patternArr[i], wordArr[i]);
        }
        
        return true;
    }
}