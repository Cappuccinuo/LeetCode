Time spent : 10 min(Self)

GIVEN: a *board* with *m* by *n* cells

RETURNS: Write a function to compute the next state (after one update) of the board given its current state.

Note: 

1. Any live cell with fewer than two live neighbors dies, as if caused by under-population.
2. Any live cell with two or three live neighbors lives on to the next generation.
3. Any live cell with more than three live neighbors dies, as if by over-population..
4. Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.

**Example:**

```
Input: 
[
  [0,1,0],
  [0,0,1],
  [1,1,1],
  [0,0,0]
]
Output: 
[
  [0,0,0],
  [1,0,1],
  [0,1,1],
  [0,1,0]
]
```

Algorithm:

Update the dead cell with 3 live neighbours to 3.

Update the live cell with <2 live neighbours or >3 live neighbours 2.

At last change 2 to 0, 3 to 1.