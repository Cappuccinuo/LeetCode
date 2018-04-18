// 2018.4.17
class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        int len = s.length();
        boolean[][] isPalindrome = new boolean[len][len];
        for (int l = 1; l <= len; l++) {
            for (int i = 0; i < len - l + 1; i++) {
                int j = i + l - 1;
                if (s.charAt(i) == s.charAt(j) && (l <= 2 || isPalindrome[i + 1][j - 1])) {
                    isPalindrome[i][j] = true;
                }
                if (res.length() < l && isPalindrome[i][j]) {
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }
}


class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        int currCharNum = 0;
        for (int i = 0; i < s.length(); i++) {
            // Deal with odd palindrome, like "aba"
            if (isPalindrome(s, i - currCharNum - 1, i)) {
                res = s.substring(i - currCharNum - 1, i + 1);
                currCharNum += 2;
            }
            // Deal with even palindrome, like "aa"
            else if (isPalindrome(s, i - currCharNum, i)) {
                res = s.substring(i - currCharNum, i + 1);
                currCharNum += 1;
            }
        }
        return res;
    }
    
    public boolean isPalindrome(String s, int begin, int end) {
        if (begin < 0) {
            return false;
        }
        while (begin < end) {
            if (s.charAt(begin) != s.charAt(end)) {
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }
}