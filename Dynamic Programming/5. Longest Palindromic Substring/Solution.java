// 2018.3.19
public class Solution {
    /**
     * @param s: input string
     * @return: the longest palindromic substring
     */
    public String longestPalindrome(String s) {
        // write your code here
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        String res = "";
        for (int l = 1; l <= len; l++) {
            for (int i = 0; i < len - l + 1; i++) {
                int j = i + l - 1;
                if (s.charAt(i) == s.charAt(j) && (l <= 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                }
                if (l > res.length() && dp[i][j]) {
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }
}

// 2018.1.3
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