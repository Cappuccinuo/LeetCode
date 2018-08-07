Time spent :  20 min(self)

GIVEN: a N * N grid

RETURNS: the total area of all three projections

EXAMPLES:

**Example 1:**

```
Input: [[2]]
Output: 5
```

**Example 2:**

```
Input: [[1,2],[3,4]]
Output: 17
Explanation: 
Here are the three projections ("shadows") of the shape made with each axis-aligned plane.
```

**Example 3:**

```
Input: [[1,0],[0,2]]
Output: 8
```

**Example 4:**

```
Input: [[1,1,1],[1,0,1],[1,1,1]]
Output: 14
```

**Example 5:**

```
Input: [[2,2,2],[2,1,2],[2,2,2]]
Output: 21
```

Algorithm:

From the top, the shadow made by the shape will be 1 square for each non-zero value.

From the side, the shadow made by the shape will be the largest value for each row in the grid.

From the front, the shadow made by the shape will be the largest value for each column in the grid.