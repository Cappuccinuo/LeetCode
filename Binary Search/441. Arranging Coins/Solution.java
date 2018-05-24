class Solution {
    public int arrangeCoins(int n) {
        return binarySearch(0, n, n);
    }
    
    private int binarySearch(int start, int end, int n) {
        while (start + 1 < end) {
            long mid = start + (end - start) / 2;
            long a = mid + 1;
            long b = mid + 2;
            if ((mid * a / 2) <= (long)n && (a * b / 2) > (long)n) {
                return (int)mid;
            }
            else if (mid * a / 2 > (long)n) {
                end = (int)mid;
            }
            else {
                start = (int)mid;
            }
        }
        
        if (end * (end + 1) / 2 <= n) {
            return end;
        }
        
        if (start * (start + 1) / 2 <= n) {
            return start;
        }
        
        return -1;
    }
}