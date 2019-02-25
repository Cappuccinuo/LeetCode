Time spent :  60 min(See hint)

GIVEN: 2D matrix which has the following features:

- The numbers in adjacent positions are different.
- The matrix has n rows and m columns.
- For all i < m, *A[0][i] < A[1][i] && A[n - 2][i] > A[n - 1][i]*.
- For all j < n, *A[j][0] < A[j][1] && A[j][m - 2] > A[j][m - 1]*.

RETURNS: Find a peak element in this matrix. Return the index of the peak. We define a position P is a peek if:

```
A[j][i] > A[j+1][i] && A[j][i] > A[j-1][i] && A[j][i] > A[j][i+1] && A[j][i] > A[j][i-1]
```

EXAMPLES:

Given a matrix:

```
[
  [1 ,2 ,3 ,6 ,5],
  [16,41,23,22,6],
  [15,17,24,21,7],
  [14,18,19,20,10],
  [13,14,11,10,9]
]
```

return index of 41 (which is `[1,1]`) or index of 24 (which is `[2,2]`)

Algorithm:

Solution 1: O(nlogm) / O(mlogn), first find the maximum in row / col, then binary search on col / row.

Solution 2: O(n + m)

Divide and conquer on both row and col. First get the mid of both row and col, mark that number as peak. Traverse the row and col of mid, find the number larger than that peak. 

Then compare the peak with the four direciton. If it is larger than anyone, return that index.

Otherwise according to current x and y, and mid_x, mid_y, as well as x1, y1, x2, y2, we recurse on 1 of the 4 parts.