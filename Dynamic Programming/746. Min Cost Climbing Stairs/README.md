Time spent : 20 min(See a little hint)

Solution : Memorization + Dynamic Programming

GIVEN: an integer array nums

RETURNS: minimum cost

Note : Either climb one or two steps, either start from step with index 0 or index 1.

EXAMPLES:

```
Input: cost = [10, 15, 20]
Output: 15
Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
```

```
nput: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
Output: 6
Explanation: Cheapest is start on cost[0], and only step on 1s, skipping cost[3].
```

Design strategy: Dynamic Programming

Use an integer array to record the min cost for every step (If we go that step)



1 100 1 1 1 100 1 1 100 1

dp[1] = 1    dp[2] = 100

dp[3] = 1 + min(dp[1], dp[2]) = 1 + 2 = 3

dp[4] = 1 + min(dp[2], dp[3]) = 1 + 3 = 4

dp[5] = 100 + min(dp[3], dp[4]) = 103

...

dp[8] = 100 + min(dp[6], dp[7]) = 104

dp[9] = 1 + min(dp[7], dp[8]) = 6

dp[10] = min(dp[8], dp[9]) = 6

