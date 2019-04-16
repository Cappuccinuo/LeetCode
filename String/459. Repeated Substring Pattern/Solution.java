class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        int i, k;
        for (i = len / 2; i >= 1; i--) {
            if (len % i != 0) {
                continue;
            }
            String sub = s.substring(0, i);
            StringBuilder newStr = new StringBuilder();
            for (k = 0; k < len / i; k++) {
                newStr.append(sub);
            }
            if (s.equals(newStr.toString())) {
                return true;
            }
        }
        return false;
    }
}