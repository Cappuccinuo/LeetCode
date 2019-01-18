Time spent :  10 min(See hint)

GIVEN: a positive integer n

RETURNS: least number of perfect square numbers (1, 4, 9, 16 ...) which sums to n

EXAMPLES:

**Example 1:**

```
Input: n = 12
Output: 3 
Explanation: 12 = 4 + 4 + 4.
```

**Example 2:**

```
Input: n = 13
Output: 2
Explanation: 13 = 4 + 9.
```

Algorithm:

First fill array with infinity.

Then for square, we assign dp[square] = 1.

Traverse every number between 1 to n,  and for every j from 1 to sqrt(n), we check if dp[i - j * j] + 1 is smaller than dp[i].