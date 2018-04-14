Time spent : 10 min(see hint)

GIVEN: an stock array

RETURNS: the maximum profit

EXAMPLES:

```
Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
```

```
Input: [7, 6, 4, 3, 1]
Output: 0

In this case, no transaction is done, i.e. max profit = 0.
```



1. assign min to prices[0]
2. if prices[i] < min, min = prices[i]
3. otherwise currProfit = prices[i] - min, if currProfit is smaller than profit, profit = currProfit

