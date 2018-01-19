class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((x & mask) != (y & mask)) {
                count++;
            }
            mask = mask << 1;
        }
        return count;
    }
}