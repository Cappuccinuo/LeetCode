class Solution {
    public int minCut(String s) {
        int len = s.length();
        boolean[][] isPalindrome = calcPalindrome(s);
        
        int[] dp = new int[len + 1];
        dp[0] = 0;
        
        int i, j;
        for (i = 1; i <= len; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (j = 0; j < i; j++) {
                if (isPalindrome[j][i - 1] && dp[j] != Integer.MAX_VALUE && dp[j] + 1 < dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        
        return dp[len] - 1;
    }
    
    private boolean[][] calcPalindrome(String s) {
        int len = s.length();
        boolean[][] result = new boolean[len][len];
        
        int i, j, p;
        
        for (i = 0; i < len; i++) {
            for (j = 0; j < len; j++) {
                result[i][j] = false;
            }
        }
        
        for (p = 0; p < len; p++) {
            i = j = p;
            while (i >= 0 && j < len && s.charAt(i) == s.charAt(j)) {
                result[i][j] = true;
                i--;
                j++;
            }
        }
        
        for (p = 0; p < len; p++) {
            i = p;
            j = p + 1;
            while (i >= 0 && j < len && s.charAt(i) == s.charAt(j)) {
                result[i][j] = true;
                i--;
                j++;
            }
        }
        
        return result;
    }
}