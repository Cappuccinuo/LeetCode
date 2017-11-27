Time spent : 15 min

Solution : DFS

GIVEN: a 2-D array of integers, Given a coordinate `(sr, sc)` representing the starting pixel (row and column) of the flood fill, and a pixel value `newColor`, "flood fill" the image.

RETURNS: the image

EXAMPLES:

```
Input: 
image = [[1,1,1],[1,1,0],[1,0,1]]
sr = 1, sc = 1, newColor = 2
Output: [[2,2,2],[2,2,0],[2,0,1]]
Explanation: 
From the center of the image (with position (sr, sc) = (1, 1)), all pixels connected 
by a path of the same color as the starting pixel are colored with the new color.
Note the bottom corner is not colored 2, because it is not 4-directionally connected
to the starting pixel.
```

DESIGN STRATEGY: DFS



1. record image\[sr][sc] as the oldColor. Use another function to do the recursion.
2. if the sr and sc are in the image bound, and image\[sr][sc] == oldColor != newColor, then assign newColor to it.
3. Do it to sr + 1, sc& sr - 1,sc….
