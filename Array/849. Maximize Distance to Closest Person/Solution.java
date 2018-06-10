// 2018.6.10 During Contest
class Solution {
    public int maxDistToClosest(int[] seats) {
        int prev = -1;
        int[] previous = new int[seats.length];
        int[] next = new int[seats.length];
        
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                prev = i;
            }
            previous[i] = prev;
        }
        
        int nex = -1;
        for (int j = seats.length - 1; j >= 0; j--) {
            if (seats[j] == 1) {
                nex = j;
            }
            next[j] = nex;
        }
        
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                if (previous[i] == -1) {
                    result = Math.max(next[i] - i, result);
                }
                else if (next[i] == -1) {
                    result = Math.max(i - previous[i], result);
                }
                else {
                    result = Math.max((next[i] - previous[i]) / 2, result);
                }
            }
        }
        
        return result;
    }
}