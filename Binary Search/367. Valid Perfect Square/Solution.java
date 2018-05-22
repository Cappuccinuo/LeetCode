class Solution {
    public boolean isPerfectSquare(int num) {
        long n = (long)num;
        if (binarySearch(0, n, n)) {
            return true;
        }
        return false;
    }
    
    private boolean binarySearch(long start, long end, long n) {
        if (start > end) {
            return false;
        }
        
        long mid = start + (end - start) / 2;
        if (mid * mid == n) {
            return true;
        }
        if (mid * mid < n) {
            return binarySearch(mid + 1, end, n);
        }
        else {
            return binarySearch(start, mid - 1, n);
        }
    }
}