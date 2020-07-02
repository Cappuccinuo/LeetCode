vclass Solution {
    public int arrangeCoins(int n) {
        int left = 1;
        int right = n;
        
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            
            long expected = expectedSum((long)mid);
            if (expected == n) {
                return mid;
            } else if (n < expected) {
                right = mid;
            } else {
                left = mid;
            }
        }
        
        if (expectedSum(right) <= n) {
            return right;
        }
        
        if (expectedSum(left) <= n) {
            return left;
        }
        
        return -1;
    }
    
    // Long is required since n * n might exceed int
    private long expectedSum(long n) {
        return (n * (n + 1) / 2);
    }
}