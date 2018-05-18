// Bit Manipulation
public class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;
        String r = s + t;
        for (int i = 0; i < r.length(); ++i) {
            c ^= r.charAt(i);
        }
        return c;
    }
}

// Hash Table
class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        for (char ch : t.toCharArray()) {
            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return ch;
            }
            map.put(ch, map.get(ch) - 1);
        }
        return 0;
    }
}

// Array
class Solution {
    public char findTheDifference(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        
        char c = 0;
        for (int i = 0; i < ss.length; i++) {
            c += (tt[i] - ss[i]);
        }
        
        return (char)(tt[tt.length - 1] + c);
    }
}