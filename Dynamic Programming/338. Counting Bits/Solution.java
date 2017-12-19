class Solution {
    public int[] countBits(int num) {
        int[] dp = new int[num + 1];
        dp[0] = 0;
        for (int i = 1; i <= num; i++) {
            dp[i] = dp[i & (i - 1)] + 1;
        }
        return dp;
    }
}


class Solution {
    public int[] countBits(int num) {
        int dp[] = new int[num + 1];
        dp[0] = 0;
        for (int i = 1; i <= num; i++) {
            dp[i] = countBit(i & (i - 1)) + 1;
        }
        return dp;
    }
    
    public int countBit(int num) {
        int mask = 1;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((num & mask) != 0) {
                count++;
            }
            mask = mask << 1;
        }
        return count;
    }
}
