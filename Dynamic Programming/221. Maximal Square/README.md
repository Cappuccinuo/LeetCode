Time spent :  20 min(Self)

GIVEN: 2D binary matrix filled with 0s and 1s.

RETURNS: the largest square containing all 1s and return its area

EXAMPLES:

For example, given the following matrix:

```
1 0 1 0 0
1 0 1 1 1
1 1 1 1 1
1 0 0 1 0
```

Return `4`.

Algorithm:

Two method: Using stack or using dynamic programming.

Using stack, the problem is similar to maximal rectangle.

Using DP, we can set the pivot at bottom right, so the graph at i, j only related to i - 1, j -1 and i, j - 1 and i - 1, j.