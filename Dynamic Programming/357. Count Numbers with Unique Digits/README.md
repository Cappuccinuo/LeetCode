Time spent : 40 min(See hints)

GIVEN: a non-negative integer n

RETURNS: count of all numbers with unique digits, x, where 0 <= x < 10^n

EXAMPLES:

```
2
return : 91
excluding[11,22,33,...,99]
```

Design strategy: Dynamic Programming



when n = 0, the number is 1

when n = 1, the number is 10, [0, 1, 2, …, 9]

when n = 2, the number is 91, (exclude 11, 22, 33…99), the formula is 10 + 9 * 9

when n = 3, the number between 101 - 999, has 9 * 9 * 8 possible choice, so the total is 10 + 9 * 9 + 9 * 9 * 8

similarly, when n =4, 10 + 9 * 9 + 9 * 9 * 8 + 9 * 9 * 8 * 7

When n > 10, the answer is 0, cause the digits from 0 -10 must all be used.



So we use result, base to calculate this. Result = 10, base = 9

from 2 - 10

base = base * (9 - i + 2)

result += base

