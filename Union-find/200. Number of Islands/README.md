Time spent : 30 min(See hint)

Solution : Union-find

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



Union-find:

Traverse the 2d grid map and union adjacent islands horizontally and vertically, at the end, return the number of connected components matained in the UnionFind data structure.