class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        
        for (int i = s1.length() - 1; i >= 0; i--) {
            dp[i][s2.length()] = dp[i + 1][s2.length()] + Integer.valueOf(s1.charAt(i));
        }
        
        for (int i = s2.length() - 1; i >= 0; i--) {
            dp[s1.length()][i] = dp[s1.length()][i + 1] + Integer.valueOf(s2.charAt(i));
        }
        
        for (int row = s1.length() - 1; row >= 0; row--) {
            for (int column = s2.length() - 1; column >= 0; column--) {
                if (s1.charAt(row) == s2.charAt(column)) {
                    dp[row][column] = dp[row + 1][column + 1];
                }
                else {
                    dp[row][column] = Math.min(dp[row + 1][column] + Integer.valueOf(s1.charAt(row)),
                                              dp[row][column + 1] + Integer.valueOf(s2.charAt(column)));
                }
            }
        }
        return dp[0][0];
    }
}