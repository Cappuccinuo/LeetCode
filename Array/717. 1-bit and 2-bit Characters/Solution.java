class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        for (i = 0; i < bits.length - 1;) {
            if (bits[i] == 0) {
                i++;
            }
            else {
                i = i + 2;
            }
        }
        return i == bits.length - 1;
    }
}