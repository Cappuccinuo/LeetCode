Time spent : 25 min(Self)

GIVEN: On a 2 dimensional grid with `R` rows and `C` columns, we start at `(r0, c0)` facing east.

RETURNS: a list of coordinates representing the positions of the grid in the order they were visited.

EXAMPLES:

**Example 1:**

```
Input: R = 1, C = 4, r0 = 0, c0 = 0
Output: [[0,0],[0,1],[0,2],[0,3]]
```

 ![](https://image.ibb.co/b8y6zT/example_1.png)

**Example 2:**

```
Input: R = 5, C = 6, r0 = 1, c0 = 4
Output: [[1,4],[1,5],[2,5],[2,4],[2,3],[1,3],[0,3],[0,4],[0,5],[3,5],[3,4],[3,3],[3,2],[2,2],[1,2],[0,2],[4,5],[4,4],[4,3],[4,2],[4,1],[3,1],[2,1],[1,1],[0,1],[4,0],[3,0],[2,0],[1,0],[0,0]]
```

![](https://image.ibb.co/bGVEm8/example_2.png)

Algorithm:

Simulate the walk process, every two walking will increase the step. Everytime we need to change the direction.