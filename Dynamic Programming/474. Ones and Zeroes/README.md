Time spent : 60 min(See a little hint)

GIVEN: an array with strings consisting of only 0s and 1s, two integers m and n, representing max 0s and 1s.

RETURNS: the maximum number of strings that can form with given m 0s and n 1s.

EXAMPLES:

```
Input: Array = {"10", "0001", "111001", "1", "0"}, m = 5, n = 3
Output: 4

Explanation: This are totally 4 strings can be formed by the using of 5 0s and 3 1s, which are “10,”0001”,”1”,”0”
```

```
Input: Array = {"10", "0", "1"}, m = 1, n = 1
Output: 2

Explanation: You could form "10", but then you'd have nothing left. Better form "0" and "1".
```

Design strategy: Dynamic Programming



This is a typical problem of 0/1 Knapsack.

Use the second example.

|        T\[i][j]        | m = 0, n = 0 | m = 0, n = 1 | m = 1, n = 0 | m = 1, n = 1 |
| :--------------------: | :----------: | :----------: | :----------: | :----------: |
| 10 (zero = 1, one = 1) |      0       |      0       |      0       |      1       |
| 0 (zero = 1, one = 0)  |      0       |      0       |      1       |      1       |
| 1 (zero = 0, one = 1)  |      0       |      1       |      1       |      2       |

if (m < zero || n < one) { T\[i][j] = T\[i - 1][j] }

if (m > zero && n > zero) { T\[i][j] = Math.max(T\[i - 1][j], 1 + T\[i][j']) } (in j', we find value at T\[i][m - zero, n - one])