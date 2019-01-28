class Solution {
    public int maxProfit(int k, int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        
        int len = prices.length;
        
        if (k == 0) {
            return 0;
        }
        
        if (k == 1) {
            return maxProfitI(prices);
        }
        
        if (k > len / 2) {
            return maxProfitII(prices);
        }
        
        return maxProfitIII(k, prices);
    }
    
    private int maxProfitI(int[] prices) {
        int result = 0;
        int min = prices[0];
        for (int price : prices) {
            result = Math.max(result, price - min);
            min = Math.min(min, price);
        }
        return result;
    }
    
    private int maxProfitII(int[] prices) {
        int result = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            result += Math.max(prices[i + 1] - prices[i], 0);
        }
        return result;
    }
    
    private int maxProfitIII(int k, int[] prices) {
        int len = prices.length;
        int[][] dp = new int[len + 1][2 * k + 1 + 1];
        
        dp[0][1] = 0;
        for (int j = 2; j <= 2 * k + 1; j++) {
            dp[0][j] = Integer.MIN_VALUE;
        }
        
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= 2 * k + 1; j += 2) {
                dp[i][j] = dp[i - 1][j];
                if (j > 1 && i > 1 && dp[i - 1][j - 1] != Integer.MIN_VALUE) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1] + prices[i - 1] - prices[i - 2]);
                }
            }
            
            for (int j = 2; j <= 2 * k + 1; j+= 2) {
                dp[i][j] = dp[i - 1][j - 1];
                if (i > 1 && dp[i - 1][j] != Integer.MIN_VALUE) {
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j] + prices[i - 1] - prices[i - 2]);
                }
            }
        }
        
        int max = 0;
        for (int j = 1; j <= 2 * k + 1; j++) {
            max = Math.max(max, dp[len][j]);
        }
        return max;
    }
}