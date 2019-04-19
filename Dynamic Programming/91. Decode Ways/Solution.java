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

class Solution {
    public int numDecodings(String s) {
        int len = s.length();
        int[] dp = new int[len + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1; 
        
        int i;
        for (i = 2; i <= len; i++) {
            String first = s.substring(i - 1, i);
            String second = s.substring(i - 2, i);
            if (Integer.parseInt(first) >= 1 && Integer.parseInt(first) <= 9) {
                dp[i] += dp[i - 1];
            }
            if (Integer.parseInt(second) >= 10 && Integer.parseInt(second) <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        
        return dp[len];
    }
}