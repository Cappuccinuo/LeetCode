class Solution {
    public int countLetters(String S) {
        char[] array = S.toCharArray();
        int len = array.length;
        int start = 0;
        int end = 0;
        int count = 0;
    
        while (end < len) {
            while (end < len && array[end] == array[start]) {
                end++;
            }
            
            count += calculateHelper(end - start);
            start = end;
        }
        
        return count;
    }
    
    private int calculateHelper(int cont) {
        return cont * (cont + 1) / 2;
    }
}

class Solution {
    public int countLetters(String S) {
        int len = S.length();
        boolean[][] dp = new boolean[len][len];
        int l, i, j;
        for (i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        for (l = 2; l <= len; l++) {
            for (i = 0; i <= len - l; i++) {
                j = i + l - 1;
                if (dp[i][j - 1] && dp[i + 1][j] && S.charAt(i) == S.charAt(j)) {
                    dp[i][j] = true;
                }
                else {
                    dp[i][j] = false;
                }
            }
        }
        int count = 0;
        for (i = 0; i < len; i++) {
            for (j = 0; j < len; j++) {
                if (dp[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }
}