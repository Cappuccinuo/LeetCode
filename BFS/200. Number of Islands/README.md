Time spent : 10 min(See hint)

Solution : BFS

GIVEN: a 2d grid map of '1's land and '0' water.

RETURNS: count the number of islands

Note: An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.

**Example 1:**

```
11110
11010
11000
00000
```

Answer: 1

**Example 2:**

```
11000
11000
00100
00011
```

Answer: 3



BFS:

Traverse all the points on the grid. If the grid is '1', then mark it '0', BFS it, put it in the queue. 

In BFS, we iteratively search the neighbors of enqueued nodes until the queue becomes empty.