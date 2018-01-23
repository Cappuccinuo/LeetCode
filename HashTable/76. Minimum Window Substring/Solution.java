class Solution {
    public String minWindow(String s, String t) {
        String result = "";
        if (s.length() < t.length()) {
            return result;
        } 
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int left = 0;
        int right = 0;
        int count = map.size();
        int minLen = Integer.MAX_VALUE;
        while (right < s.length()) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    count--;
                }
            }
            right++;
            while (count == 0) {
                char temp = s.charAt(left);
                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                    if (map.get(temp) > 0) {
                        count++;
                    }
                }
                if (right - left < minLen) {
                    minLen = right - left;
                    result = s.substring(left, right);
                }
                left++;
            }
        }
        return result;
    }
}