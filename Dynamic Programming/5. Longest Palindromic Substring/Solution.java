class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        String res = "";
        boolean[][] isPalindrome = new boolean[len][len];
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i; j < len; j++) {
                if (s.charAt(i) == s.charAt(j) && (j - i < 3 || isPalindrome[i + 1][j - 1])) {
                    isPalindrome[i][j] = true;
                }
                if (j - i + 1 > res.length() && isPalindrome[i][j]) {
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }
}