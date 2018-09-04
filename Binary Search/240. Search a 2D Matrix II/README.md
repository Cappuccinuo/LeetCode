Time spent :  15 min(Self)

GIVEN: a m * n matrix and a target.

Note: the matrix

- Integers in each row are sorted in ascending from left to right.
- Integers in each column are sorted in ascending from top to bottom.

RETURNS: true if the target exists 

EXAMPLES:

Consider the following matrix:

```
[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
```

Given target = `5`, return `true`.

Given target = `20`, return `false`.

Algorithm:

1. Binary Search

As the matrix is sorted, we can use binary search to speed up the search. We can binary search both the row and col.

2. We start from the bottom left point. When the current value is larger than target, we move the row up. Otherwise we move the col right.