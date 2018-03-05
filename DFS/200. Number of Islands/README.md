Time spent : 10 min(See hint)

Solution : DFS

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



DFS:

Intuition: treat the 2d grid map as an undirected graph and there is an edge between two horizontally or vertically adjacent nodes of value '1'

Algorithm: Linear scan the 2d grid map, if a node contains '1', then it is a root node that triggers a DFS. During DFS, every visited node should be set as '0' to mark as visited node. Count the number of root nodes that trigger DFS, this number would be the number of islands since each DFS starting at some root identifies an island.