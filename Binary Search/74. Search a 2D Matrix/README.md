Time spent : 5 min(Self)

GIVEN: a 2D matrix and a target

RETURNS: true iff the value exists in the matrix

EXAMPLES:

**Example 1:**

```
Input:
matrix = [
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
target = 3
Output: true
```

**Example 2:**

```
Input:
matrix = [
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
target = 13
Output: false
```

Algorithm:

The most fast way to solve the problem is start from left corner. When current num is larger than target, we can move to the upper row. Otherwise we can move to the next column.

Another solution is using binary search, this way we need to traverse from 0 to m * n - 1, notice that current value is equal to matrix\[mid / n][mid % n]