class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int start = 0;
        int end = 0;
        int ans = 0;
        int len = s.length();
        int distinctCount = 0;
        int[] map = new int[256];
        
        while (start < len) {
            while (end < len && distinctCount <= 2) {
                char ch = s.charAt(end);
                end++;
                map[ch]++;
                if (map[ch] == 1) {
                    distinctCount++;
                }
                if (distinctCount <= 2) {
                    ans = Math.max(ans, end - start);
                }
            }
            
            char c = s.charAt(start);
            start++;
            map[c]--;
            if (map[c] == 0) {
                distinctCount--;
            }
        }
        
        return ans;
    }
}

class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int start = 0;
        int end = 0;
        int ans = 0;
        int len = s.length();
        int distinctCount = 0;
        int[] map = new int[256];
        
        while (end < len) {
            char ch = s.charAt(end);
            end++;
            map[ch]++;
            if (map[ch] == 1) {
                distinctCount++;
            }
            
            if (distinctCount <= 2) {
                ans = Math.max(ans, end - start);
            }
            
            while (distinctCount > 2) {
                char c = s.charAt(start);
                start++;
                map[c]--;
                if (map[c] == 0) {
                    distinctCount--;
                }
            }
        }
        
        return ans;
    }
}