class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        long reversed = reverseNumber(x);
        if (reversed == x) {
            return true;
        }
        return false;
    }
    
    private long reverseNumber(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        return result;
    }
}