Time spent : 20 min

Solution : grid -> MaxArea

GIVEN: a 2-D array grid

RETURNS: the max area of island

EXAMPLES:

Input: 

```
[[0,0,1,0,0,0,0,1,0,0,0,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,1,1,0,1,0,0,0,0,0,0,0,0],
 [0,1,0,0,1,1,0,0,1,0,1,0,0],
 [0,1,0,0,1,1,0,0,1,1,1,0,0],
 [0,0,0,0,0,0,0,0,0,0,1,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,0,0,0,0,0,0,1,1,0,0,0,0]]
```

Output: 6

DESIGN STRATEGY: DFS



1. Loop in the grid, when the grid[i][j] == 1, compare its area, which is computed by areaOfIsland function, and the current maxarea

2. In the areaOfIsland funtion, reset the point area to 0, so we will not compute that again, but don't forget to add its area 1 to the area.

3. There are four directions, so compute four directions and combine the area together.
