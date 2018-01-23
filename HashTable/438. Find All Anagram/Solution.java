class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int len = p.length();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= s.length() - len; i++) {
            if (isAnagram(s.substring(i, i + len), p)) {
                result.add(i);
            }
        }
        return result;
    }
    
    public boolean isAnagram(String a, String b) {
        int[] map = new int[26];
        for (char c : a.toCharArray()) {
            map[c - 'a']++;
        }
        for (char c : b.toCharArray()) {
            map[c - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (map[i] != 0) {
                return false;
            }
        }
        return true;
    }
}