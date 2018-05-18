Time spent : 20 min(See hint)

GIVEN: a 2D grid

RETURNS: the maximum enemies you can kill using one bomb

Note: The bomb kills all the enemies in the same row and column from the planted point until it hits the wall

**Example:**

```
For the given grid

0 E 0 0
E 0 W E
0 E 0 0

return 3. (Placing a bomb at (1,1) kills 3 enemies)
```



We just need to calculate the number of enemies in each row and col.  We just need to store one killed enemy for a row, and an array of each column. If current grid value is W, this means previous stored value is invalid, we need to recalculate. If the value is 0, we update the max value.