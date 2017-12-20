Time spent : 30 min(self)

GIVEN: a sequence of number

RETURNS: the number of arithmetic slices in the array A

Note: A sequence of number is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.

A slice (P, Q) of array A is called arithmetic if the sequence:
A[P], A[p + 1], ..., A[Q - 1], A[Q] is arithmetic. In particular, this means that P + 1 < Q.

EXAMPLES:

```
A = [1, 2, 3, 4]

return: 3, for 3 arithmetic slices in A: [1, 2, 3], [2, 3, 4] and [1, 2, 3, 4] itself.
```



First I write some examples to find the pattern.

1 3 5 7 9 11 13

| N numbers | n arithmetic slices |
| :-------: | :-----------------: |
|     1     |          0          |
|     2     |          0          |
|     3     |          1          |
|     4     |          3          |
|     5     |          6          |
|     6     |         10          |
|     7     |         15          |
|           |                     |

So here we find the pattern, 

for N = 4, dp[4] = dp[3] + (3 - 1) = 1 + 2 = 3

for N = 5, dp[5] = dp[4] + (4 - 1) = 3 + 3 = 6...

So we use dynamic programming to solve the problem.

dp[i] = dp[i - 1] + (i - 2)



To optimize my code, I see the code in solution, very clean and concise.

Just compare A[i] - A[i - 1] == A[i - 1] - A[i - 2]

dp = 1 + dp, sum += dp