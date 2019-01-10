Time spent : 5  min(See hint)

GIVEN: an array for which the *i*th element is the price of a given stock on day *i*.

RETURNS: the maximum profit.

Note: Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times) with the following restrictions:

- You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
- After you sell your stock, you cannot buy stock on next day. (ie, cooldown 1 day)

**Example:**

```
Input: [1,2,3,0,2]
Output: 3 
Explanation: transactions = [buy, sell, cooldown, buy, sell]
```

Algorithm:

DP

sell[i] is the maximum profit on day i without stock, buy[i] is the maximum profit on day i with stock.

For sell, on day i we can sell or not sell. If sell, the profit is buy[i - 1] + prices[i], otherwise sell[i - 1], we pick the max one.

For buy, it is sell[i - 2] - prices[i] or buy[ i -1] cause of cooldown.

