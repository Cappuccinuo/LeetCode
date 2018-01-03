Time spent : 10 min(See hint)

GIVEN: a 2D integer matrix M

RETURNS: a matrix after smooth

EXAMPLES:

```
Input:
[[1,1,1],
 [1,0,1],
 [1,1,1]]
Output:
[[0, 0, 0],
 [0, 0, 0],
 [0, 0, 0]]
Explanation:
For the point (0,0), (0,2), (2,0), (2,2): floor(3/4) = floor(0.75) = 0
For the point (0,1), (1,0), (1,2), (2,1): floor(5/6) = floor(0.83333333) = 0
For the point (1,1): floor(8/9) = floor(0.88888889) = 0
```



We need to judge for every i, j index if that index is valid, so we can do the math.

So use a function to judge index validation based on M's size.

        int[] dx = new int[]{0, 0, 1, -1, 1, -1, 1, -1};
        int[] dy = new int[]{-1, 1, 0, 0, 1, -1, -1, 1};
These are all possible position for a cell, if each pair is valid, count++, add that cell val to sum.

When go over the two array, use (int)Math.floor(sum / count).