Time spent :  5 min(See hint)

GIVEN: a positive number N

RETURNS: how many numbers X from 1 to N are good

Note: X is a good number if after rotating each digit individually by 180 degrees, we get a valid number that is different from X.  Each digit must be rotated - we cannot choose to leave it alone.

EXAMPLES:

```
Example:
Input: 10
Output: 4
Explanation: 
There are four good numbers in the range [1, 10] : 2, 5, 6, 9.
Note that 1 and 10 are not good numbers, since they remain unchanged after rotating.
```

Algorithm:

dp[i] = 0 represent cannot form good number, dp[i] = 1 represent number is potential good number but with no rotation, dp[i] = 2 represent good number with rotation.

for i < 10, dp[i] = 1 if i is in [0, 1, 8], dp[i] = 2 if i is in [2, 5, 6, 9], else dp[i] = 0.

for other numbers, a = dp[i / 10], b = dp[i % 10], if a and b are both 1, then dp[i] is also 1. If a and b are both larger than 1, then dp[i] is 2.