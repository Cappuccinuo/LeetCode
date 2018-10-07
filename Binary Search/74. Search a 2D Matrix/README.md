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

From the bottom row, using binary search. If the row[0] is larger than target, we can skip.