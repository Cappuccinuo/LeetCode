class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        
        int len = prices.length;
        int[][] dp = new int[len + 1][5 + 1];
        
        dp[0][1] = 0;
        for (int j = 2; j <= 5; j++) {
            dp[0][j] = Integer.MIN_VALUE;
        }
        
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= 5; j += 2) {
                dp[i][j] = dp[i - 1][j];
                if (i > 1 && j > 1 && dp[i - 1][j - 1] != Integer.MIN_VALUE) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1] + prices[i - 1] - prices[i - 2]);
                }
            }
            
            for (int j = 2; j <= 4; j+= 2) {
                dp[i][j] = dp[i - 1][j - 1];
                if (i > 1 && dp[i - 1][j] != Integer.MIN_VALUE) {
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j] + prices[i - 1] - prices[i - 2]);
                }
            }
        }
        
        int max = 0;
        for (int j = 1; j <= 5; j++) {
            max = Math.max(max, dp[len][j]);
        }
        return max;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        Integer buy1 = Integer.MIN_VALUE;
        Integer buy2 = Integer.MIN_VALUE;
        int sell1 = 0;
        int sell2 = 0;
        
        for (int i = 0; i < prices.length; i++) {
            buy1 = Math.max(buy1, -prices[i]);
            sell1 = Math.max(sell1, buy1 + prices[i]);
            buy2 = Math.max(buy2, sell1 - prices[i]);
            sell2 = Math.max(sell2, buy2 + prices[i]);
        }
        
        return sell2;
    }
}