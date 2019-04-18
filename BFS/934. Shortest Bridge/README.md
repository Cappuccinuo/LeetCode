Time spent :  30 min(See hint)

GIVEN: In a given 2D binary array `A`, there are two islands.  (An island is a 4-directionally connected group of `1`s not connected to any other 1s.) Now, we may change `0`s to `1`s so as to connect the two islands together to form 1 island.

RETURNS: Return the smallest number of `0`s that must be flipped.  (It is guaranteed that the answer is at least 1.)

EXAMPLES:

**Example 1:**

```
Input: [[0,1],[1,0]]
Output: 1
```

**Example 2:**

```
Input: [[0,1,0],[0,0,0],[0,0,1]]
Output: 2
```

**Example 3:**

```
Input: [[1,1,1,1,1],[1,0,0,0,1],[1,0,1,0,1],[1,0,0,0,1],[1,1,1,1,1]]
Output: 1
```

Algorithm:

First using DFS find one island, and mark all the island as visited true.

Then do BFS on all these island node. If we meet a new node that is not visited and is 1, return step.