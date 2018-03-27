Time spent : 10 min

GIVEN: an array sorted in ascending order is rotated to some pivot.

RETURNS: a target value's position

EXAMPLES:

Input: 

```
4 5 6 7 0 1 2       find 7
```

Output: 3

DESIGN STRATEGY: Binary Search



1. deal with two situations when nums[start] < nums[mid] and nums[start] > nums[mid]
2. draw a picture of the trend
