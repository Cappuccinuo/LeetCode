Time spent :  15 min(Self)

GIVEN: an array which consists of non-negative integers and an integer m you can split the array into *m* non-empty continuous subarrays. 

RETURNS: minimize the largest sum among these *m* subarrays.

EXAMPLES:

```
Input:
nums = [7,2,5,10,8]
m = 2

Output:
18

Explanation:
There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8],
where the largest sum among the two subarrays is only 18.
```

Algorithm:

确定状态

Think which position we split at the last step? If the position is x, then result must be Math.min(dp\[x - 1][m - 1], sum[x - len]).

Here dp\[i][j] represent the minimum sum using previous i numbers dividing to j parts.

So dp\[i][j] = Math.min(dp\[i][j], Math.max(dp\[k][j - 1], sum[i] - sum[k])), here k traverse from j - 1 to i.

初始条件

dp\[i][1] = sum[i]

at last, we return dp\[len][m]