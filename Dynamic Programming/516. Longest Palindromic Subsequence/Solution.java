// 2019.2.9
class Solution {
    int len;
    int[][] dp;
    
    public int longestPalindromeSubseq(String s) {
        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        
        len = s.length();
        dp = new int[len][len];
        
        char[] c = s.toCharArray();
        calc(c, 0, len - 1);
        return dp[0][len - 1];
    }
    
    private void calc(char[] c, int i, int j) {
        // A must step, if has been filled with value, return
        if (dp[i][j] != 0) {
            return;
        }
        
        if (i == j) {
            dp[i][j] = 1;
            return;
        }
        
        if (i + 1 == j) {
            if (c[i] == c[j]) {
                dp[i][j] = 2;
            }
            else {
                dp[i][j] = 1;
            }
            return;
        }
        
        calc(c, i, j - 1);
        calc(c, i + 1, j);
        calc(c, i + 1, j - 1);
        
        dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
        if (c[i] == c[j]) {
            dp[i][j] = Math.max(dp[i][j], dp[i + 1][j - 1] + 2);
        }
    }
}


// 2018.3.19
public class Solution {
    /**
     * @param s: the maximum length of s is 1000
     * @return: the longest palindromic subsequence's length
     */
    public int longestPalindromeSubseq(String s) {
        // write your code here
        if (s.length() == 0) {
            return 0;
        }
        int len = s.length();
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = 1;
        }
        for (int l = 2; l <= len; l++) {
            for (int i = 0; i < len - l + 1; i++) {
                int j = i + l - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                }
                else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][len - 1];
    }
}


class Solution {
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = 1;
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = 2 + dp[i + 1][j - 1];
                }
                else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][s.length() - 1];
    }
}