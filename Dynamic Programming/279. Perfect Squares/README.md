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

1. Ensure the status: Last step, the last square we use j^2, in the optimal strategy, n - j^2 must be divided to least number of splits. Subproblem: n - j^2 divided to how many square sum.
2. f[i] = min(1 <= j * j <= i){f[i - j^2] + 1}
3. Init and boundary: f[0] = 0, f[1...n] = Integer.MAX_VALUE
4. Answer is f[n]