class Solution {
    public boolean isMatch(String s, String p) {
        char[] ss = s.toCharArray();
        char[] pp = p.toCharArray();
        int slen = s.length();
        int plen = p.length();
        boolean[][] dp = new boolean[slen + 1][plen + 1];
        
        int i, j;
        dp[0][0] = true;
        
        for (i = 0; i <= slen; i++) {
            for (j = 1; j <= plen; j++) {
                if (pp[j - 1] != '*') {
                    if (i > 0 && (ss[i - 1] == pp[j - 1] || pp[j - 1] == '.')) {
                        dp[i][j] |= dp[i - 1][j - 1];
                    }
                }
                else {
                    if (j > 1) {
                        dp[i][j] |= dp[i][j - 2];
                    }
                    
                    if (i > 0 && (ss[i - 1] == pp[j - 2] || pp[j - 2] == '.')) {
                        dp[i][j] |= dp[i - 1][j];
                    }
                }
            }
        }

        return dp[slen][plen];
    }
}

class Solution {
    public boolean isMatch(String s, String p) {
        int slen = s.length();
        int plen = p.length();
        boolean[][] memo = new boolean[slen + 1][plen + 1];
        boolean[][] visited = new boolean[slen + 1][plen + 1];
        return dp(s, 0, p, 0, memo, visited);
    }
    
    private boolean dp(String s, int sIndex, String p, int pIndex, boolean[][] memo, boolean[][] visited) {
        if (pIndex == p.length()) {
            return sIndex == s.length();
        }
        
        if (sIndex == s.length()) {
            return isEmpty(p, pIndex);
        }
        
        if (visited[sIndex][pIndex]) {
            return memo[sIndex][pIndex];
        }
        
        char a = s.charAt(sIndex);
        char b = p.charAt(pIndex);
        boolean match;
        
        if (pIndex + 1 < p.length() && p.charAt(pIndex + 1) == '*') {
            match = charMatch(a, b) && dp(s, sIndex + 1, p, pIndex, memo, visited) ||
                dp(s, sIndex, p, pIndex + 2, memo, visited);
        }
        else {
            match = charMatch(a, b) && dp(s, sIndex + 1, p, pIndex + 1, memo, visited);
        }
        
        visited[sIndex][pIndex] = true;
        memo[sIndex][pIndex] = match;
        return match;
    }
    
    private boolean charMatch(char a, char b) {
        return a == b || b == '.';
    }
    
    private boolean isEmpty(String p, int pIndex) {
        for (int i = pIndex; i < p.length(); i += 2) {
            if (i + 1 >= p.length() || p.charAt(i + 1) != '*') {
                return false;
            }
        }
        return true;
    }
}

class Solution {
    public boolean isMatch(String s, String p) {
        if (p.length() == 0) {
            return s.length() == 0;
        }
        
        boolean firstMatch = s.length() != 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
        
        if (p.length() >= 2 && p.charAt(1) == '*') {
            return isMatch(s, p.substring(2)) ||
                (firstMatch && isMatch(s.substring(1), p));
        }
        else {
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }
}