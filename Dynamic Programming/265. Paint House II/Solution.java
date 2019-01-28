class Solution {
    public int minCostII(int[][] costs) {
        if (costs == null || costs.length == 0) {
            return 0;
        }
        int n = costs.length;
        int k = costs[0].length;
        int[][] dp = new int[n][k];
        
        for (int j = 0; j < k; j++) {
            dp[0][j] = costs[0][j];
            
        }
        
        for (int i = 1; i < n; i++) {
            int a = -1;
            int b = -1;
            for (int j = 0; j < k; j++) {
                if (a == -1 || dp[i - 1][j] < dp[i - 1][a]) {
                    b = a;
                    a = j;
                }
                else {
                    if (b == -1 || dp[i - 1][j] < dp[i - 1][b]) {
                        b = j;
                    }
                }
            }
            
            // dp[i - 1][a] is the smallest, dp[i - 1][b] is the second smallest
            for (int j = 0; j < k; j++) {
                if (j == a) {
                    dp[i][j] = dp[i - 1][b] + costs[i][j];
                }
                else {
                    dp[i][j] = dp[i - 1][a] + costs[i][j];
                }
            }
        }
        
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < k; j++) {
            min = Math.min(min, dp[n - 1][j]);
        }
        return min;
    }
}