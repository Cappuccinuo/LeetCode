class Solution {
    public int trailingZeroes(int n) {
        int zeroNum = 0;
        while (n > 0) {
            n = n / 5;
            zeroNum += n;
        }
        return zeroNum;
    }
}