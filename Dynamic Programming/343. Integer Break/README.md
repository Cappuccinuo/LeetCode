Time spent : 10 min(See hint)

GIVEN: Given a positive integer *n*

RETURNS: break it into the sum of **at least** two positive integers and maximize the product of those integers. Return the maximum product you can get.

EXAMPLES:

**Example 1:**

```
Input: 2
Output: 1
Explanation: 2 = 1 + 1, 1 × 1 = 1.
```

**Example 2:**

```
Input: 10
Output: 36
Explanation: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36.
```

Algorithm:

We use dp[i] to represent the maximum product we can get given number i.

So the formula is we pick Math.max(dp[j], j) * Math.max(dp[i - j], i - j), for j from 1 to i.