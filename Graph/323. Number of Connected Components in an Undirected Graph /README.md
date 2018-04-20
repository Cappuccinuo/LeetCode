Time spent : 20min(self) 

GIVEN: n nodes labeled from 0 to n-1 and a list of undirected edges(each edge is a pair of nodes)

RETURNS: the number of connected components in an undirected graph

**Example 1:**

```
     0          3
     |          |
     1 --- 2    4
```

Given `n = 5` and `edges = [[0, 1], [1, 2], [3, 4]]`, return `2`.

**Example 2:**

```
     0           4
     |           |
     1 --- 2 --- 3
```

Given `n = 5` and `edges = [[0, 1], [1, 2], [2, 3], [3, 4]]`, return `1`.

Solution 1 : Union Find     Write a class name union find. Notice when edges is null, we have n connected components.

Solution 2 : DFS    Notice that this is a undirected graph, so for adj list, we need to add edge in both vertices.

Solution 3 : BFS