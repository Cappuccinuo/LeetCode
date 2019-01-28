class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        
        int result = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            result += Math.max(prices[i + 1] - prices[i], 0);
        }
        return result;
    }
}

class Solution1 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i - 1] > 0) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
}

class Solution2 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if (prices.length == 0) {
            return maxProfit;
        }
        int peak = prices[0];
        int valley = prices[0];
        int i = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1]) {
                i++;
            }
            peak = prices[i];
            maxProfit += peak - valley;
        }
        return maxProfit;
    }
}