Time spent :  5 min(Self)

GIVEN: an input array nums

RETURNS: the peak element's index

EXAMPLES:

**Example 1:**

```
Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
```

**Example 2:**

```
Input: nums = [1,2,1,3,5,6,4]
Output: 1 or 5 
Explanation: Your function can return either index number 1 where the peak element is 2, 
             or index number 5 where the peak element is 6.
```

Algorithm:

Using binary search. While start + 1 < end, If nums[mid] < nums[mid + 1], we move start to mid. Otherwise we move end to mid.

At last we compare start and end.