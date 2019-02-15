class Solution {
    public int numDistinct(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return 0;
        }
        int m = s.length();
        int n = t.length();
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        int[][] dp = new int[m + 1][n + 1];
        int i, j;
        
        for (i = 0; i <= m; i++) {
            dp[i][0] = 1;
        }
        
        for (i = 1; i <= m; i++) {
            for (j = 1; j <= n; j++) {
                dp[i][j] = dp[i - 1][j];
                if (ss[i - 1] == tt[j - 1]) {
                    dp[i][j] += dp[i - 1][j - 1];
                }
            }
        }
        
        return dp[m][n];
    }
}