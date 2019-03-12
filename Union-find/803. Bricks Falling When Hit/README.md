Time spent :  60 min

GIVEN: Grid of 1 and 0 represent bricks. And a hit array represent erase brick at a position.

RETURNS: an array representing the number of bricks that will drop after each erasure in sequence.

Note: A brick will not drop if and only if it is directly connected to the top of the grid, or at least one of its (4-way) adjacent bricks will not drop.

EXAMPLES:

```
Example 1:
Input: 
grid = [[1,0,0,0],[1,1,1,0]]
hits = [[1,0]]
Output: [2]
Explanation: 
If we erase the brick at (1, 0), the brick at (1, 1) and (1, 2) will drop. So we should return 2.
Example 2:
Input: 
grid = [[1,0,0,0],[1,1,0,0]]
hits = [[1,1],[1,0]]
Output: [0,0]
Explanation: 
When we erase the brick at (1, 0), the brick at (1, 1) has already disappeared due to the last move. So each erasure will cause no bricks dropping.  Note that the erased brick (1, 0) will not be counted as a dropped brick.
```

Algorithm:

What we need at each step? We want to know how many bricks connect to the top level. If at time t the number is x, and at time t + 1 the number is y, then the falling bricks number is x - y.

Instead of doing hit from begining, we can traverse it from the end, so that we know how much will not fall, and recover the hit one by one. 

So we first flag all the hit brick as 2. Then union all the bricks left in 4 directions. The brick at the row 0 will connect to the top. 

In unionFind, we use 0 to represent the top.

What we get at this step is the bricks that must not fall after a hit.

Then we traverse hit from back. Recover the 2 -> 1, and union it with 4 directions brick. We use last step union.size(union.find(0)) - this step number, is the bricks fall at this hit.