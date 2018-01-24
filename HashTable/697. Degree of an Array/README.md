Time spent : 15 min(self)	

GIVEN: a non-empty array of non-negative integers

RETURNS: smallest possible length of a contiguous subarray of nums, that has the same degree as nums

Note:  the **degree** of this array is defined as the maximum frequency of any one of its elements.

EXAMPLES:

```
Input: [1, 2, 2, 3, 1]
Output: 2
Explanation: 
The input array has a degree of 2 because both elements 1 and 2 appear twice.
Of the subarrays that have the same degree:
[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
The shortest length is 2. So return 2.
```

```
Input: [1,2,2,3,1,4,2]
Output: 6   [2,2,3,1,4,2]
```

DESIGN STRATEGY: HashMap



1. Maintain 3 hashmaps. One saves the leftmost index of the num, one saves the rightmost index of the num, one saves the frequency of all the nums.
2. Use collections.max we can get the max degree.
3. Go through the count keyset. If count.get(i) == degree, we compare minLen with right.get(i) - left.get(i)

