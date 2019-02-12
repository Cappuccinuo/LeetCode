class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0;
        int end = 0;
        int repeat = 0;
        int res = 0;
        char[] array = s.toCharArray();
        int len = s.length();
        int maxCount = 0;
        int[] map = new int[26];
        int i;
        while (end < len) {
            char c = array[end];
            end++;
            map[c - 'A']++;
            maxCount = Math.max(maxCount, map[c - 'A']);
            
            while (end - start - maxCount > k) {
                char ch = array[start];
                start++;
                map[ch - 'A']--;
                for (i = 0; i < 26; i++) {
                    maxCount = Math.max(maxCount, map[i]);
                }
            }
            
            res = Math.max(res, end - start);
        }
        return res;
    }
}