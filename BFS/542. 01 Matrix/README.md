Time spent : 10 min(Self)

GIVEN: Given a matrix consists of 0 and 1

RETURNS: find the distance of the nearest 0 for each cell.

EXAMPLES:

**Example 1:**

```
Input:
[[0,0,0],
 [0,1,0],
 [0,0,0]]

Output:
[[0,0,0],
 [0,1,0],
 [0,0,0]]
```

**Example 2:**

```
Input:
[[0,0,0],
 [0,1,0],
 [1,1,1]]

Output:
[[0,0,0],
 [0,1,0],
 [1,2,1]]
```

Algorithm:

BFS.

Put all the cells 0 into the queue.