Time spent :  10 min(See hint)

GIVEN: an array for which the ith element is the price of a given stock on day i

RETURNS: the maximum profit. You may complete at most two transactions

EXAMPLES:

**Example 1:**

```
Input: [3,3,5,0,0,3,1,4]
Output: 6
Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
             Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.
```

**Example 2:**

```
Input: [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
             Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
             engaging multiple transactions at the same time. You must sell before buying again.
```

**Example 3:**

```
Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.
```

Algorithm:

Confusing One:

Buy1 means that we have to borrow money from others. We want to borrow less.

Sell1 means we decide to sell the stock, after selling it we have to give back the money we borrow.

Buy2 means that we want to buy another stock. We already have sell1 money.

Sell2 means we want to sell stock2, we can have price[i] money after selling it, and we have buy2 money left before. So sell2 is the most money we can have.



DP class:

We can divide the problem to five stages:

1. Do not have stock
2. Hold stock
3. Sell stock, not buy again yet
4. Hold stock
5. Sell stock

For stage 1, 3, 5   dp\[i][j] = Math.max(dp\[i - 1][j], dp\[i - 1][j - 1] + Pi-1 - Pi-2)

​                                            do not have stock yesterday           have stock in the previous stage, sold today

For stage 2, 4       dp\[i][j] = Math.max(dp\[i - 1][j - 1], dp\[i - 1][j] + Pi-1 - Pi-2)

​                                            do not have stock yesterday, buy today     have stock yesterday, keep holding

See we don't need to keep track of which day we bought the stock, if we have stock, we just use today's stock price - yesterday price, for example 1, 2, 3, 4, 5 is the stock we keep holding, so the profit is 5 - 1 = 4, the same as 2 - 1 + 3 - 2 + 4 - 3 + 5 - 4.