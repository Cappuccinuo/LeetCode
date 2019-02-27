Time spent :  20 min(Self)

GIVEN: On an `N`x`N` chessboard, a knight starts at the `r`-th row and `c`-th column and attempts to make exactly `K` moves. The rows and columns are 0 indexed, so the top-left square is `(0, 0)`, and the bottom-right square is `(N-1, N-1)`.

RETURNS:Return the probability that the knight remains on the board after it has stopped moving.

EXAMPLES:

```
Input: 3, 2, 0, 0
Output: 0.0625
Explanation: There are two moves (to (1,2), (2,1)) that will keep the knight on the board.
From each of those positions, there are also two moves that will keep the knight on the board.
The total probability the knight stays on the board is 0.0625.
```

Algorithm:

1. BFS + DP

   for board 

   1 0 0

   0 0 0

   0 0 0

   in the given example, we can see that 1 has two available point in board that are available. One is (1, 2), the other is (2, 1). So the prob of that two is 0.125(1.0 / 8). In next round, we calculate that two point's available position's prob. So we need to update dp every time in a new dp array.

   

   init DP2

   BFS on current point in queue

   update dp = dp2

   

   Pay special attention that, we cannot add same point twice, so we also need a set to record.

2. DP

   Same idea with previous way. Except we check each time, if dp\[i][j] > 0, we update its 'neighbour'.

3. DFS + memo

   Typical top-down approach DP. If memo\[i][j] exist, we return memo\[i][j].

   In our situation, we need to track k. If k == 0, we return 1, cause for that position the probability is definitely 1.

   For each point, we DFS on its 'neighbour', for the total prob of 8 neighbour, we take 1/8 on the total, that is the prob for that position.