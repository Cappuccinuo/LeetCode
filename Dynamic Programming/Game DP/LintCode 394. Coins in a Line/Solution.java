// Rolling array
public class Solution {
    /**
     * @param n: An integer
     * @return: A boolean which equals to true if the first player will win
     */
    public boolean firstWillWin(int n) {
        // write your code here
        if (n == 0) {
            return false;
        }
        if (n == 1 || n == 2) {
            return true;
        }
        boolean[] dp = new boolean[3];
        dp[0] = false;
        dp[1] = true;
        dp[2] = true;
        for (int i = 3; i <= n; i++) {
            dp[i % 3] = !dp[(i - 1) % 3] || !dp[(i - 2) % 3];
        }
        return dp[n % 3];
    }
}

public class Solution {
    /**
     * @param n: An integer
     * @return: A boolean which equals to true if the first player will win
     */
    public boolean firstWillWin(int n) {
        // write your code here
        if (n == 0) {
            return false;
        }
        if (n == 1 || n == 2) {
            return true;
        }
        boolean[] dp = new boolean[n + 1];
        dp[0] = false;
        dp[1] = true;
        dp[2] = true;
        for (int i = 3; i <= n; i++) {
            dp[i] = !dp[i - 1] || !dp[i - 2];
        }
        return dp[n];
    }
}