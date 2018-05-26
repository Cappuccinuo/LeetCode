// 2018.5.25
class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split("\\s+");
        char[] letters = pattern.toCharArray();
        Map<String, Character> wordMap = new HashMap<>();
        Map<Character, String> charMap = new HashMap<>();
        if (words.length != letters.length) {
            return false;
        }
        
        for (int i = 0; i < words.length; i++) {
            if (wordMap.containsKey(words[i]) && !charMap.containsKey(letters[i]) 
                || !wordMap.containsKey(words[i]) && charMap.containsKey(letters[i])
                || wordMap.containsKey(words[i]) && !wordMap.get(words[i]).equals(letters[i]) 
                || charMap.containsKey(letters[i]) && !charMap.get(letters[i]).equals(words[i])) {
                return false;
            }
            
            if (!wordMap.containsKey(words[i]) && !charMap.containsKey(letters[i])) {
                wordMap.put(words[i], letters[i]);
                charMap.put(letters[i], words[i]);
            }
        }
        
        return true;
    }
}



class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split("\\s+");
        char[] patterns = pattern.toCharArray();
        if (words.length != patterns.length) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < patterns.length; i++) {
            char p = patterns[i];
            String word = words[i];
            if (map.containsKey(p) && !map.get(p).equals(word)) {
                return false;
            }
            if (map.containsValue(word) && !map.containsKey(p)) {
                return false;
            }
            map.put(p, word);
        }
        return true;
    }
}