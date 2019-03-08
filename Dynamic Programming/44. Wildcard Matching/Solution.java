class Solution {
    public boolean isMatch(String s, String p) {
        int slen = s.length();
        int plen = p.length();
        char[] ss = s.toCharArray();
        char[] pp = p.toCharArray();
        boolean[][] dp = new boolean[slen + 1][plen + 1];
        dp[0][0] = true;
        
        int i, j;
        for (i = 0; i <= slen; i++) {
            for (j = 1; j <= plen; j++) {
                if (pp[j - 1] != '*') {
                    if (i > 0 && (pp[j - 1] == '?' || pp[j - 1] == ss[i - 1])) {
                        dp[i][j] |= dp[i - 1][j - 1];
                    }
                }
                else {
                    dp[i][j] |= dp[i][j - 1];
                    
                    if (i > 0) {
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
        if (s == null || p == null) {
            return false;
        }
        int slen = s.length();
        int plen = p.length();
        boolean[][] memo = new boolean[slen][plen];
        boolean[][] visited = new boolean[slen][plen];
        return isMatchHelper(memo, visited, s, 0, p, 0);
    }
    
    private boolean isMatchHelper(boolean[][] memo,
                                 boolean[][] visited,
                                 String s, int sIndex,
                                 String p, int pIndex) {
        if (s.length() == sIndex) {
            return checkEmpty(p, pIndex);
        }
        
        if (p.length() == pIndex) {
            return s.length() == 0;
        }
        
        if (visited[sIndex][pIndex]) {
            return memo[sIndex][pIndex];
        }
        
        char sletter = s.charAt(sIndex);
        char pletter = p.charAt(pIndex);
        
        boolean match = false;
        if (pletter == '*') {
            match = isMatchHelper(memo, visited, s, sIndex + 1, p, pIndex) ||
                isMatchHelper(memo, visited, s, sIndex, p, pIndex + 1);
        }
        else {
            match = isMatch(sletter, pletter) && isMatchHelper(memo, visited, s, sIndex + 1, p, pIndex + 1);
        }
        memo[sIndex][pIndex] = match;
        visited[sIndex][pIndex] = true;
        return match;
    }
    
    private boolean isMatch(char a, char b) {
        return a == b || b == '?';
    }
    
    private boolean checkEmpty(String p, int pIndex) {
        for (int i = pIndex; i < p.length(); i++) {
            if (p.charAt(i) != '*') {
                return false;
            }
        }
        return true;
    }
}