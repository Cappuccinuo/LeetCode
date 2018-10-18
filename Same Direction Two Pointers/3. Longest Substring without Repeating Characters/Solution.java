// Control Start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int ans = 0;
        int len = s.length();
        int[] map = new int[256];
        while (start < len) {
            while (end < len && map[s.charAt(end)] == 0) {
                map[s.charAt(end)] = 1;
                end++;
            }
            
            ans = Math.max(end - start, ans);
            map[s.charAt(start)] = 0;
            start++;
        }
        
        return ans;
    }
}
// Control End
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int len = s.length();
        int ans = 0;
        int[] map = new int[256];
        while (end < len) {
            char c = s.charAt(end++);
            map[c]++;
            
            while (map[c] > 1) {
                map[s.charAt(start)]--;
                start++;
            }
            
            ans = Math.max(ans, end - start);
        }
        return ans;
    }
}