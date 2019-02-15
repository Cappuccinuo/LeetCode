Time spent :  5 min(See hint)

GIVEN: a number n

RETURNS: how much money you need to have to guarantee a win



EXAMPLES:

**Example:**

```
n = 10, I pick 8.

First round:  You guess 5, I tell you that it's higher. You pay $5.
Second round: You guess 7, I tell you that it's higher. You pay $7.
Third round:  You guess 9, I tell you that it's lower. You pay $9.

Game over. 8 is the number I picked.

You end up paying $5 + $7 + $9 = $21.
```

Algorithm:

确定状态

suppose that we pick x from 1 - n, then the min value we need to win is x + the min value we need to win at scope 1 - (x - 1), and the min value we need to win at scope (x + 1) - n.

So we have array dp\[i][j], which represent the min value we need to have to win for range i to j.

dp\[i][j] = Math.min(Math.max(dp\[i][k - 1], dp\[k + 1][j]) + k, dp\[i][j])

初始条件

for dp\[i][i], equal to 0.

结果

dp\[1][n]