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