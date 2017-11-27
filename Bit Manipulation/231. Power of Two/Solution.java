class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean isNonNegative = (n >= 0);
        boolean isOneBit = (Integer.bitCount(n) == 1);
        return isNonNegative && isOneBit;
    }
}