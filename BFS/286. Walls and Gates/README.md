Time spent : 15 min(Self)

GIVEN: a m * n 2D grid

Note: 

1. `-1` - A wall or an obstacle.
2. `0` - A gate.
3. `INF` - Infinity means an empty room. We use the value `231 - 1 = 2147483647` to represent `INF` as you may assume that the distance to a gate is less than `2147483647`.

Effect: Fill each empty room with the distance to its nearest gate.If it is impossible to reach a gate, it should be filled with `INF`.

EXAMPLES:

**Example:** 

Given the 2D grid:

```
INF  -1  0  INF
INF INF INF  -1
INF  -1 INF  -1
  0  -1 INF INF
```

After running your function, the 2D grid should be:

```
  3  -1   0   1
  2   2   1  -1
  1  -1   2  -1
  0  -1   3   4
```

Algorithm:

Using BFS. Instead of doing BFS for each cell with value 0, we first offer all the point with 0 into queue, then do BFS on the queue. Cause the order we push is the shortest distance to each gate, we don't need to "split level". If the new x, y is inbound, and its value is Integer.MAX_VALUE, we change rooms\[x][y] = rooms\[i][j] + 1.