class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for (char c : ransomNote.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            }
            else {
                if (map.get(c) == 0) {
                    return false;
                }
                map.put(c, map.get(c) - 1);
            }
        }
        
        return true;
    }
}

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] map = new int[26];
        
        for (char c : magazine.toCharArray()) {
            map[c - 'a']++;
        }
        
        for (char c : ransomNote.toCharArray()) {
            map[c - 'a']--;
            if (map[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}