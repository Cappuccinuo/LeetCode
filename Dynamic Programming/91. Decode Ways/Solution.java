class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }
        int[] dp = new int[n + 1];
        dp[n] = 1;
        dp[n - 1] = s.charAt(n - 1) != '0' ? 1 : 0;
        
        for (int i = n - 2; i >= 0; i--) {
            String number = s.substring(i, i + 2);
            if (s.charAt(i) == '0') {
                continue;
            }
            else {
                if (Integer.parseInt(number) <= 26) {
                    dp[i] = dp[i + 1] + dp[i + 2];
                }
                else {
                    dp[i] = dp[i + 1];
                } 
            } 
        }
        return dp[0];
    }
}