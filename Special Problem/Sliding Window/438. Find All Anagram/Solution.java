class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || p == null || s.length() < p.length()) {
            return result;
        }
        int[] map = new int[26];
        for (char c : p.toCharArray()) {
            map[c - 'a']++;
        }
        int left = 0;
        int right = 0;
        int count = p.length();
        char[] sArr = s.toCharArray();
        while (right < s.length()) {
            if (map[sArr[right++] - 'a']-- >= 1) {
                count--;
            }
            if (count == 0) {
                result.add(left);
            }
            if ((right - left) == p.length() && map[sArr[left++] - 'a']++ >= 0) {
                count++;
            }
        }
        return result;
    }
}

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // Final Result
        List<Integer> result = new LinkedList<>();
        // Two Pointers, move end
        int start = 0;
        int end = 0;
        // character frequency of s
        int[] sMap = new int[26];
        // character frequency of p
        int[] pMap = new int[26];
        for (char pLetter : p.toCharArray()) {
            pMap[pLetter - 'a']++;
        }
        // Len of s
        int len = s.length();
        
        while (end < len) {
            char sLetter = s.charAt(end);
            end++;
            sMap[sLetter - 'a']++;
            
            while (pMap[sLetter - 'a'] < sMap[sLetter - 'a']) {
                char sLetterStart = s.charAt(start);
                start++;
                sMap[sLetterStart - 'a']--;
            }
            
            if (end - start == p.length()) {
                result.add(start);
            }
        }
        return result;
    }
}