Time spent :  5 min(Self)

GIVEN: an sorted array in ascending order that is rotated at some pivot unknown beforehand.

(i.e., `[0,0,1,2,2,5,6]` might become `[2,5,6,0,0,1,2]`).

And a target value.

RETURNS: If found in the array return `true`, otherwise return `false`.

EXAMPLES:

**Example 1:**

```
Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true
```

**Example 2:**

```
Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false
```

Algorithm:

This problem test if you can know the worst case, that is [0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0], which takes O(n) to find.