Time spent : 15 min(Self)

GIVEN: n nodes labeled from 0 to n - 1 and a list of undirected edges

RETURNS: check whether these edges make up a valid tree

EXAMPLES:

**Example 1:**

```
Input: n = 5, and edges = [[0,1], [0,2], [0,3], [1,4]]
Output: true
```

**Example 2:**

```
Input: n = 5, and edges = [[0,1], [1,2], [2,3], [1,3], [1,4]]
Output: false
```

Algorithm:

If edges.length is not n - 1, return false. Cause tree's edge must be #node - 1.

1. UnionFind, check if at last, connect component is 1.
2. BFS + HashSet, check if at last, the set's size is #node.