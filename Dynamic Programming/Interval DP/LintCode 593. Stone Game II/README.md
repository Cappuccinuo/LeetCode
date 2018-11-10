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

The difference between this problem and last stone game is that, this time the stone form a cycle. So we need to expand the array, [4, 1, 1, 4] -> [4, 1, 1, 4, 4, 1, 1, 4] and check [4, 1, 1, 4], [1, 1, 4, 4], [1, 4, 4, 1], [4, 4, 1, 1].