Time spent : 15min(See hint)

GIVEN: coins of different denominations and a total amount of money

RETURNS: the number of combinations that make up that amount

**Note**:
You may assume that you have an infinite number of each kind of coin.

**Example 1:**

```
Input: amount = 5, coins = [1, 2, 5]
Output: 4
Explanation: there are four ways to make up the amount:
5=5
5=2+2+1
5=2+1+1+1
5=1+1+1+1+1

```

**Example 2:**

```
Input: amount = 3, coins = [2]
Output: 0
Explanation: the amount of 3 cannot be made up just with coins of 2.

```

**Example 3:**

```
Input: amount = 10, coins = [10] 
Output: 1
```



For each coin, we can calculate how many combinations there is for every amount. When coin is 1, all the amount just have 1 combinations. For other coins, dp[i] = dp[i] + dp[i - coin], dp[i] means combinations for amount i.