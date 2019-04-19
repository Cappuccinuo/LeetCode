Time spent :  10 min(Self)

GIVEN: Given an array of integers `nums` sorted in ascending order

RETURNS: find the starting and ending position of a given `target` value.

EXAMPLES:

**Example 1:**

```
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
```

**Example 2:**

```
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
```

Algorithm:

Using two binary search. The difference between first and last is when nums[mid] == target. When we find the first element, we move end to mid, else we move start to mid.