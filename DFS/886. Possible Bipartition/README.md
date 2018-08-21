Time spent :  15 min(See hint)

GIVEN: a set of N people(1,2,...,N) and dislike array

Note: Formally, if `dislikes[i] = [a, b]`, it means it is not allowed to put the people numbered `a` and `b` into the same group. 

RETURNS: true iff it is possible to split everyone into two groups in this way

EXAMPLES:

**Example 1:**

```
Input: N = 4, dislikes = [[1,2],[1,3],[2,4]]
Output: true
Explanation: group1 [1,4], group2 [2,3]
```

**Example 2:**

```
Input: N = 3, dislikes = [[1,2],[1,3],[2,3]]
Output: false
```

**Example 3:**

```
Input: N = 5, dislikes = [[1,2],[2,3],[3,4],[4,5],[1,5]]
Output: false
```

Algorithm:

It is a problem of graph which is formed by the given dislike edges. For each connected component, we can check whether it is bipartite by just trying to coloring it with two colors. Color one node red, then all it's neighbors blue, and so on.. If we never color a red node blue, we will not reach a conflict.