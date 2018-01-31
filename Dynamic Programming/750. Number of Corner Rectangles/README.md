Time spent : 50 min(self + see hint of last solution)

GIVEN: a gird where each entry is only 0 or 1

RETURNS: the number of rectangles



EXAMPLES:

```
Input: grid = 
[[1, 0, 0, 1, 0],
 [0, 0, 1, 0, 1],
 [0, 0, 0, 1, 0],
 [1, 0, 1, 0, 1]]
Output: 1
Explanation: There is only one corner rectangle, with corners grid[1][2], grid[1][4], grid[3][2], grid[3][4].
```

```
Input: grid = 
[[1, 1, 1],
 [1, 1, 1],
 [1, 1, 1]]
Output: 9
Explanation: There are four 2x2 rectangles, four 2x3 and 3x2 rectangles, and one 3x3 rectangle.
```

```
Input: grid = 
[[1, 1, 1, 1]]
Output: 0
Explanation: Rectangles must have four distinct corners.
```

Solution 1 : 

Iterate through all rows in the grid. Use a map to store two locations row[i] == 1 and row[j] == 1 which can form a base. Then when go to next rows, if map contains same i,j, count++. 

Solution 2 :

Call a row to be heavy if it has more than sqrt(N) points.

Say the entire top row is filled with 1s. When looking at the next row with say, `f` 1s that match the top row, the number of rectangles created is just the number of pairs of 1s, which is `f * (f-1) / 2`. We could find each `f`quickly using a Set and a simple linear scan of each row.