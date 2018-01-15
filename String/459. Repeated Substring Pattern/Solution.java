class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        if (len == 1) {
            return false;
        }
        int middle = len / 2;
        if (s.substring(0, middle).equals(s.substring(middle, len))) {
            return true;
        }
        int third = len / 3;
        if (s.substring(0, third).equals(s.substring(third, third * 2)) &&
           s.substring(0, third).equals(s.substring(third * 2, len))) {
            return true;
        }
        // Do the odd len string last, cause cases like "abcabcabc"
        if (len % 2 == 1) {
            char first = s.charAt(0);
            for (int i = 1; i < len; i++) {
                if (s.charAt(i) != first) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}