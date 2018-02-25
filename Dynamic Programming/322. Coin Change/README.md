Time spent : 15min(Self)

GIVEN: a set of coins of different denominations, and a total amount of money amount 

RETURNS: the fewest number of coins need to make up the amount. If cannot make up, return -1

**Note**:
You may assume that you have an infinite number of each kind of coin.

**Example 1:**
coins = `[1, 2, 5]`, amount = `11`
return `3` (11 = 5 + 5 + 1)

**Example 2:**
coins = `[2]`, amount = `3`
return `-1`.



Optimal Structure:

Suppose the optimal solution is \<c1, c2, c2, c3>

Then for every decision, the subsolution must be optimal, for example c1, c2 for amount c1 + c2.

So we need a table, the argument is the amount so far. First initiate as amount + 1.

dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1)