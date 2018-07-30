Time spent :  30 min(see hint)

GIVEN: an even number of piles **arranged in a row**, and each pile has a positive integer number of stones `piles[i]`.

RETURNS: Return `True` if and only if Alex wins the game.

Note: The objective of the game is to end with the most stones.  The total number of stones is odd, so there are no ties.

Alex and Lee take turns, with Alex starting first.  Each turn, a player takes the entire pile of stones from either the beginning or the end of the row.  This continues until there are no more piles left, at which point the person with the most stones wins. 

EXAMPLES:

```
Input: [5,3,4,5]
Output: true
Explanation: 
Alex starts first, and can only take the first 5 or the last 5.
Say he takes the first 5, so that the row becomes [3, 4, 5].
If Lee takes 3, then the board is [4, 5], and Alex takes 5 to win with 10 points.
If Lee takes the last 5, then the board is [3, 4], and Alex takes 4 to win with 9 points.
This demonstrated that taking the first 5 was a winning move for Alex, so we return true.
```

Algorithm:

Math: Alex will always win. If Alex takes the first pile initially, she can always take the third pile. If she takes the fourth pile initially, she can always take the second pile. At least one of `first + third, second + fourth` is larger, so she can always win.



DP: dp\[i][j] means the biggest number of stones we can get more than opponent picking piles in piles[i] ~ piles[j].

If we pick piles[i], the result will be piles[i] - dp\[i + 1][j]

If we pick piles[j], the result will be piles[j] - dp\[i][j - 1] 