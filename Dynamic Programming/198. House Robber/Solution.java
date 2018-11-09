public class Solution {
    /**
     * @param A: An array of non-negative integers
     * @return: The maximum amount of money you can rob tonight
     */
    public long houseRobber(int[] A) {
        // write your code here
        if (A == null || A.length == 0) {
            return 0;
        }
        int len = A.length;
        long[] dp = new long[len + 1];
        dp[0] = 0;
        dp[1] = A[0];
        
        for (int i = 2; i <= len; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + A[i - 1]);
        }
        
        return dp[len];
    }
}

class Solution1 {
    public int rob(int[] nums) {
        int rob = 0;
        int notrob = 0;
        for (int num : nums) {
            int robcurrent = notrob + num;
            notrob = Math.max(rob, notrob);
            rob = robcurrent;
        }
        return Math.max(rob, notrob);
    }
}

class Solution2 {
    public int rob(int[] nums) {
        int prevMax = 0;
        int currMax = 0;
        for (int num : nums) {
            int temp = currMax;
            currMax = Math.max(prevMax + num, currMax);
            prevMax = temp;
        }
        return currMax;
    }
}