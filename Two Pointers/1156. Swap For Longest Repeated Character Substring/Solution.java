class Solution {
    public int maxRepOpt1(String text) {
        Map<Character, Integer> letterCount = new HashMap<>();
        char[] letters = text.toCharArray();
        for (char letter : letters) {
            letterCount.put(letter, letterCount.getOrDefault(letter, 0) + 1);
        }
        
        int start = 0;
        int end = 0;
        int result = 0;
        int maxCount = 0;
        int len = text.length();
        int i;
        int[] map = new int[26];
        
        while (end < len) {
            char letter = letters[end];
            end++;
            map[letter - 'a']++;
            maxCount = Math.max(maxCount, map[letter - 'a']);
            
            while (end - start - maxCount > 1 || end - start > letterCount.get(letters[start])) {
                char c = letters[start];
                start++;
                map[c - 'a']--;
                for (i = 0; i < 26; i++) {
                    maxCount = Math.max(maxCount, map[i]);
                }
            }
            
            result = Math.max(result, end - start);
        }
        
        return result;
    }
}