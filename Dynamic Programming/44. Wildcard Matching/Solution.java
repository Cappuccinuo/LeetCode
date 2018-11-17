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