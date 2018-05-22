class Solution {
    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int)b) {
                return true;
            }
        }
        return false;
    }
}

class Solution {
    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            int b = c - (int)(a * a);
            if (binarySearch(0, b, b)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean binarySearch(long start, long end, int n) {
        if (start > end) {
            return false;
        }
        
        long mid = start + (end - start) / 2;
        if (mid * mid == n) {
            return true;
        }
        
        if (mid * mid > n) {
            return binarySearch(start, mid - 1, n);
        }
        else {
            return binarySearch(mid + 1, end, n);
        }
    }
}