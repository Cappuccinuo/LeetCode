class Solution {
    public int superpalindromesInRange(String L, String R) {
        int ans = 0;
        
        Long lval = Long.valueOf(L);
        Long rval = Long.valueOf(R);
        
        int root = (int)Math.pow(10, 18 * 0.25);
        
        // count odd length
        for (int i = 1; i < root; i++) {
            StringBuilder sb = new StringBuilder(Integer.toString(i));
            for (int j = sb.length() - 2; j >= 0; j--) {
                sb.append(sb.charAt(j));    
            }
            Long v = Long.valueOf(sb.toString());
            v = v * v;
            if (v > rval) {
                break;
            }
            if (v >= lval && isPalindrome(v)) {
                ans++;
            }
        }
        
        // count even length
        for (int i = 1; i < root; i++) {
            StringBuilder sb = new StringBuilder(Integer.toString(i));
            for (int j = sb.length() - 1; j >= 0; j--) {
                sb.append(sb.charAt(j));
            }
            Long v = Long.valueOf(sb.toString());
            v = v * v;
            if (v > rval) {
                break;
            }
            if (v >= lval && isPalindrome(v)) {
                ans++;
            }
        }
        
        return ans;
    }
    
    private boolean isPalindrome(long number) {
        return number == reverse(number);
    }
    
    private long reverse(long number) {
        long res = 0;
        while (number > 0) {
            res = res * 10 + number % 10;
            number = number / 10;
        }
        return res;
    }
}