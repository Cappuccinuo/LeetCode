class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int maxLen = 0;
        for (int i = 0, j = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(i, map.get(s.charAt(j)) + 1);
            }
            map.put(s.charAt(j), j);
            int len = j - i + 1;
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int count = 0;
        int result = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (map.get(c) > 1) {
                count++;
            }
            right++;
            
            while (count > 0) {
                char temp = s.charAt(left);
                if (map.get(temp) > 1) {
                    count--;
                }
                map.put(temp, map.get(temp) - 1);
                left++;
            }
            
            result = Math.max(result, right - left);
        }
        return result;
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int count = 0;
        int res = 0;
        
        while (right < s.length()) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);
            count++;
            right++;
            
            if (map.get(c) > 1) {
                while (map.get(c) > 1) {
                    char temp = s.charAt(left);
                    left++;
                    map.put(temp, map.get(temp) - 1);
                    count--;
                }
            }
            
            res = Math.max(res, count);
        }
        
        return res;
    }
}