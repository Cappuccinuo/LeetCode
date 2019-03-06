Time spent :  10 min(Self)

GIVEN: a 2D plane, place stones at some integer coordinate points.  Each coordinate point may have at most one stone.

Now, a *move* consists of removing a stone that shares a column or row with another stone on the grid.

RETURNS: largest possible number of moves we can make?

EXAMPLES: 

**Example 1:**

```
Input: stones = [[0,0],[0,1],[1,0],[1,2],[2,1],[2,2]]
Output: 5
```

**Example 2:**

```
Input: stones = [[0,0],[0,2],[1,1],[2,0],[2,2]]
Output: 3
```

**Example 3:**

```
Input: stones = [[0,0]]
Output: 0
```

Algorithm:

We can union the stones at same row and col, at last, the most stones we can move is the number of stones - connected components.