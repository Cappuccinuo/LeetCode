// My solution
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

// Solution 1
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            i += bits[i] + 1;
        }
        return i == bits.length - 1;
    }
}