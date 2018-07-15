// 2018.7.15 During Contest
class Solution {
    public int binaryGap(int N) {
        int max = 0;
        int mask = 1;
        int prev = -1;
        for (int i = 0; i < 32; i++) {
            if ((N & mask) != 0) {
                if (prev != -1) {
                    max = Math.max(max, i - prev);
                }
                prev = i;
            }
            mask = mask << 1;
        }
        return max;
    }
}