class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (map.containsKey(sc) && map.get(sc) != tc) {
                return false;
            }
            if (map.containsValue(tc) && !map.containsKey(sc)) {
                return false;
            }
            map.put(sc, tc);
        }
        return true;
    }
}

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int len = s.length();
        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();
        for (int i = 0; i < len; i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (!sToT.containsKey(a) && !tToS.containsKey(b)) {
                sToT.put(a, b);
                tToS.put(b, a);
            }
            else {
                if (!sToT.containsKey(a) || !tToS.containsKey(b)) {
                    return false;
                }
                else if (sToT.get(a) != b || tToS.get(b) != a) {
                    return false;
                }
            }
        }
        return true;
    }
}