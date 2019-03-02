Time spent :  15 min(See hint)

GIVEN: Four points in 2D space

RETURNS: whether the four points could construct a square

EXAMPLES:

```
Input: p1 = [0,0], p2 = [1,1], p3 = [1,0], p4 = [0,1]
Output: True
```

Algorithm:

Put four points in a 2d array, sort the array first by x. If two points have equal x, then sort by y.

After sort, the square is like

p1 p3

p0 p2

Then check if four sides are equal and two diagonals are equal.