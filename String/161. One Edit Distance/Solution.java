class Solution {
    public boolean isOneEditDistance(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        for (int i = 0; i < Math.min(slen, tlen); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (slen == tlen) {
                    return s.substring(i + 1).equals(t.substring(i + 1));
                }
                else if (slen > tlen) {
                    return s.substring(i + 1).equals(t.substring(i));
                }
                else {
                    return s.substring(i).equals(t.substring(i + 1));
                }
            }
        }
        return Math.abs(slen - tlen) == 1;
    }
}