class Solution3 {
    private int count = 1;
    public int countSubstrings(String s) {
        if (s.length() == 0) {
            return 0;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            checkPalindrome(s, i, i);
            checkPalindrome(s, i, i + 1);
        }
        return count;
    }
    
    public void checkPalindrome(String s, int lo, int hi) {
        while (lo >= 0 && hi < s.length() && s.charAt(lo) == s.charAt(hi)) {
            count++;
            lo--;
            hi++;
        }
    }
}

class Solution2 {
    public int countSubstrings(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int[] dp = new int[s.length()];
        dp[0] = 1;
        int start = 0;
        int end = 0;
        for (int i = 1; i < s.length(); i++) {
            dp[i] += dp[i - 1] + 1;
            if ((i + 1) < s.length() && s.charAt(i - 1) == s.charAt(i + 1)) {
                start = i - 1;
                end = i + 1;
                while (start >= 0 && end < s.length()) {
                    if (s.charAt(start) != s.charAt(end)) {
                        break;
                    }
                    if (s.charAt(start) == s.charAt(end)) {
                        dp[end]++;
                    }
                    start--;
                    end++;
                }
            }
            if (s.charAt(i - 1) == s.charAt(i)) {
                start = i - 1;
                end = i;
                while (start >= 0 && end < s.length()) {
                    if (s.charAt(start) != s.charAt(end)) {
                        break;
                    }
                    if (s.charAt(start) == s.charAt(end)) {
                        dp[end]++;
                    }
                    start--;
                    end++;
                }
            }
        }
        return dp[s.length() - 1];
    }
}

class Solution1 {
    public int countSubstrings(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int[] dp = new int[s.length()];
        dp[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            dp[i] = dp[i - 1] + 1;
            for (int j = 0; j < i; j++) {
                if (isPalindrome(s.substring(j, i + 1))) {
                    dp[i]++;
                }
            }
        }
        return dp[s.length() - 1];
    }
    
    public boolean isPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}