Time spent :  10 min(Self)

GIVEN: Given n pieces of wood with length `L[i]` (integer array). Cut them into small pieces to guarantee you could have equal or more than k pieces with the same length

RETURNS:  the maximum length of the small pieces

**Example 1:**

```
For L=[232, 124, 456], k=7, return 114.
```

Algorithm:

1. Hard part : the range of binary search -> 0 to max(L)
2. How to check if a len fit : linear check every wood and add the part num.