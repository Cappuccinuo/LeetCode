Time spent :  10 min(Self)

GIVEN: graph that started as a tree with N nodes (with distinct values 1, 2, ..., N), with one additional edge added.

RETURNS: an edge that can be removed so that the resulting graph is a tree of N nodes.  If there are multiple answers, return the answer that occurs last in the given 2D-array. The answer edge `[u, v]` should be in the same format, with `u < v`.

EXAMPLES:

**Example 1:**

```
Input: [[1,2], [1,3], [2,3]]
Output: [2,3]
Explanation: The given undirected graph will be like this:
  1
 / \
2 - 3
```



**Example 2:**

```
Input: [[1,2], [2,3], [3,4], [1,4], [1,5]]
Output: [1,4]
Explanation: The given undirected graph will be like this:
5 - 1 - 2
    |   |
    4 - 3
```

Algorithm:

Use Union Find, if after union, the component count of the graph is the same, that edge is the result.