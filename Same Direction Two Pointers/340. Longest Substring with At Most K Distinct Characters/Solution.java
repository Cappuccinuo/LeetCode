class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int start = 0;
        int end = 0;
        int count = 0;
        int ans = 0;
        int[] map = new int[256];
        int len = s.length();
        while (start < len) {
            while (end < len && count <= k) {
                char ch = s.charAt(end);
                end++;
                map[ch]++;
                if (map[ch] == 1) {
                    count++;
                }
                if (count <= k) {
                    ans = Math.max(ans, end - start);
                }
            }
            
            char c = s.charAt(start);
            start++;
            map[c]--;
            if (map[c] == 0) {
                count--;
            }
        }
        return ans;
    }
}

class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int start = 0;
        int end = 0;
        int count = 0;
        int ans = 0;
        int[] map = new int[256];
        int len = s.length();
        while (end < len) {
            char c = s.charAt(end);
            end++;
            map[c]++;
            if (map[c] == 1) {
                count++;
            }
            
            if (count <= k) {
                ans = Math.max(ans, end - start);
            }
            
            while (count > k) {
                char ch = s.charAt(start);
                start++;
                map[ch]--;
                if (map[ch] == 0) {
                    count--;
                }
            }
        }
        return ans;
    }
}