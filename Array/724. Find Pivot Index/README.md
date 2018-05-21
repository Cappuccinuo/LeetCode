Time spent : 5 min

GIVEN: an array of integers

RETURNS: the pivot index of this array

Note: The pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.

**Example 1:**

```
Input: 
nums = [1, 7, 3, 6, 5, 6]
Output: 3
Explanation: 
The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
Also, 3 is the first index where this occurs.
```

**Example 2:**

```
Input: 
nums = [1, 2, 3]
Output: -1
Explanation: 
There is no index that satisfies the conditions in the problem statement.
```



We only need to know about leftSum to check whether an index is a pivot index by compare leftSum with sum - leftSum - nums[i].