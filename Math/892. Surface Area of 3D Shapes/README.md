 Time spent : 15 min(See hint)

GIVEN: a N*N grid, each value `v = grid[i][j]` represents a tower of `v` cubes placed on top of grid cell `(i, j)`.

RETURNS: the total surface area of the resulting shapes.

EXAMPLES:

**Example 1:**

```
Input: [[2]]
Output: 10
```

**Example 2:**

```
Input: [[1,2],[3,4]]
Output: 34
```

**Example 3:**

```
Input: [[1,0],[0,2]]
Output: 16
```

**Example 4:**

```
Input: [[1,1,1],[1,0,1],[1,1,1]]
Output: 32
```

**Example 5:**

```
Input: [[2,2,2],[2,1,2],[2,2,2]]
Output: 46
```

Algorithm:

Traverse Square by Square, when v > 0, the top and bottom surface contributes 2.

Then, for each side (west side, north side, east side, south side) of the column at `grid[i][j]`, the neighboring cell with value `nv` means our square contributes `max(v - nv, 0)`.