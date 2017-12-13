Time spent : 10 min (Self)

GIVEN: Given an sorted array  and a target number

RETURNS: indices of two numbers such that they add up to the target, index are not zero-based

EXAMPLES:

Input: 

```
nums = [2, 7, 11, 15], and target = 9.
```

Output: [1, 2]

DESIGN STRATEGY: Two Pointers



1. As the array is sorted, we can use binary search.

2. sum == target, return result; sum < target, lo++; sum > target, **hi--**

3. The index is not zero-based, so each result should add 1.

   ​

