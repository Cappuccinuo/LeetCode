// 2018.6.30
class Solution {
    public int titleToNumber(String s) {
        int len = s.length();
        int result = 0;
        for (int i = 0; i < len; i++) {
            result += Math.pow(26, i) * (s.charAt(len - i - 1) - 'A' + 1);
        }
        return result;
    }
}

class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            result += (int)Math.pow(26, s.length() - 1 - i) * (s.charAt(i) - 'A' + 1);
        }
        return result;
    }
}