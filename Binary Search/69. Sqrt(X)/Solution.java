class Solution {
    public int mySqrt(int x) {
        // Find the last element that makes res * res <= x
        long start = 0;
        long end = (long)(x / 2 + 1);
        while (start + 1 < end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == x) {
                return (int)mid;
            }
            else if (mid * mid > x) {
                end = mid;
            }
            else {
                start = mid;
            }
        }
        if (end * end <= x) {
            return (int)end;
        }
        return (int)start;
    }
}