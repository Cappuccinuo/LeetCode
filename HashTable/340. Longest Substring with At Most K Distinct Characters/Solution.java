class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int count = 0;
        int maxLen = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (map.get(c) == 1) {
                count++;
            }
            right++;
            while (count > k) {
                char temp = s.charAt(left);
                map.put(temp, map.get(temp) - 1);
                if (map.get(temp) == 0) {
                    count--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left);
        }
        return maxLen;
    }
}