Time spent :  5 min(Self)

GIVEN: Given an integer array sorted in ascending order, write a function to search `target` in `nums`. Array size is unknown, may only access the array using an `ArrayReader` interface, where `ArrayReader.get(k)` returns the element of the array at index `k` (0-indexed).

RETURNS: The index of the target, -1 if not exists.

EXAMPLES:

**Example 1:**

```
Input: array = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
```

**Example 2:**

```
Input: array = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
```

Algorithm:

First we can know the upper bound of target in array by reverse inquiry. Every time we double the max, if reader.get(max) >= target, we stop. Then do the typical binary search.