Time spent :  5 min(See hint)

GIVEN: Given an array `nums` sorted in **non-decreasing** order, and a number `target`

RETURNS: `True` if and only if `target` is a majority element.

EXAMPLES:

**Example 1:**

```
Input: nums = [2,4,5,5,5,5,5,6,6], target = 5
Output: true
Explanation: 
The value 5 appears 5 times and the length of the array is 9.
Thus, 5 is a majority element because 5 > 9/2 is true.
```

**Example 2:**

```
Input: nums = [10,100,101,101], target = 101
Output: false
Explanation: 
The value 101 appears 2 times and the length of the array is 4.
Thus, 101 is not a majority element because 2 > 4/2 is false.
```

Algorithm:

Using binary search to find the first pos of target and last pos of target, then compare the number of element with the length / 2.