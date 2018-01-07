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