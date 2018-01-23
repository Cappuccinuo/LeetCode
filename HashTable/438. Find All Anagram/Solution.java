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