class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int dp = 0;
        int sum = 0;
        
        for (int i = 2; i < A.length; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                dp = 1 + dp;
                sum += dp;
            }
            else {
                dp = 0;
            }
        }
        return sum;
    }
}

class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        if (A.length == 0 || A.length == 1) {
            return 0;
        }
        int count = 0;
        int currentConsecutive = 2;
        int difference = A[1] - A[0];
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i + 1] - A[i] == difference) {
                currentConsecutive++;
                continue;
            }
            count += getArithmeticNum(currentConsecutive);
            currentConsecutive = 2;
            difference = A[i + 1] - A[i];
        }
        count += getArithmeticNum(currentConsecutive);
        return count;
    }
    
    public int getArithmeticNum(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 0;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + i - 2;
        }
        return dp[n];
    }
}