class Solution {
    public boolean isPowerOfFour(int num) {
        boolean isNonNegative = (num >= 0);
        boolean isOneBit = (Integer.bitCount(num) == 1);
        boolean evenZero = (Integer.bitCount(num - 1) % 2 == 0);
        return isNonNegative && isOneBit && evenZero;
    }
}