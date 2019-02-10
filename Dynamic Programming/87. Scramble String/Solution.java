class Solution {
    public boolean isScramble(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int len = s1.length();
        boolean[][][] dp = new boolean[len][len][len + 1];
        
        int i, j, k, w;
        char[] s = s1.toCharArray();
        char[] t = s2.toCharArray();
        for (i = 0; i < len; i++) {
            for (j = 0; j < len; j++) {
                if (s[i] == t[j]) {
                    dp[i][j][1] = true;
                }
            }
        }
        
        for (k = 2; k <= len; k++) {
            for (i = 0; i <= len - k; i++) {
                for (j = 0; j <= len - k; j++) {
                    dp[i][j][len] = false;
                    for (w = 1; w < k; w++) {
                        if (dp[i][j][w] && dp[i + w][j + w][k - w]) {
                            dp[i][j][k] = true;
                            break;
                        }
                        
                        if (dp[i][j + k - w][w] && dp[i + w][j][k - w]) {
                            dp[i][j][k] = true;
                            break;
                        }
                    }
                }
            }
        }
        
        return dp[0][0][len];
    }
}