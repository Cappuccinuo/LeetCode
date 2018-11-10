Time spent :  20 min(Self)

GIVEN: a stone game, at the beginning of the game the player picks n piles of stones in a line.

RETURNS: The goal is to merge the stones in one pile observing the following rules:

1. At each step of the game,the player can merge two adjacent piles to a new pile.
2. The score is the number of stones in the new pile.

You are to determine the minimum of the total score.



**Example 1:**

For `[4, 1, 1, 4]`, in the best solution, the total score is `18`:

```
1. Merge second and third piles => [4, 2, 4], score +2
2. Merge the first two piles => [6, 4]，score +6
3. Merge the last two piles => [10], score +10
```



Algorithm:

First this is not a greedy problem. Like 6 4 4 6, if we merge the minimum two, we get 8 + 14 + 20, while if we merge 6 4, we get 10 + 10 + 20. 

Our function is f\[i][j] represents the minimum spend to merge ith to jth stone.

We can find that we always need to add the sum in this interval, no matter how we combine numbers.

So we need to preprocessing sum\[i][j] or prefix sum array to record the sum in interval.

dp\[i][j] = Math.min(dp\[i][j], sum\[i][j] + dp\[i][k] + dp\[k + 1][j])