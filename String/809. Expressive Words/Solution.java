class Solution {
    public int expressiveWords(String S, String[] words) {
        int cnt = 0;
        for (String word : words) {
            if (isStrech(S, word)) {
                cnt++;
            }
        }
        return cnt;
    }
    
    private boolean isStrech(String S, String W) {
        int slen = S.length();
        int wlen = W.length();
        int j = 0;
        
        for (int i = 0; i < slen; i++) {
            if (j < wlen && S.charAt(i) == W.charAt(j)) {
                j++;
            }
            else if (i > 1 && S.charAt(i) == S.charAt(i - 1) && S.charAt(i - 1) == S.charAt(i - 2)) {
                continue;
            }
            else if (i > 0 && i < slen - 1 && S.charAt(i) == S.charAt(i - 1) && S.charAt(i) == S.charAt(i + 1)) {
                continue;
            }
            else {
                return false;
            }
        }
        
        return j == wlen;
    }
}