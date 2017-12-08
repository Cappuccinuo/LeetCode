Time spent : 30 min (Self)

GIVEN: Given an array *S* of *n* integers, and a target

RETURNS: Find all unique quadruplets in the array which gives the sum of target.

EXAMPLES:

Input: 

```
S = [1, 0, -1, 0, -2, 2], and target = 0.
```

Output: [  [-1,  0, 0, 1],  [-2, -1, 1, 2],  [-2,  0, 0, 2]]



DESIGN STRATEGY: Two Pointers



1. The same thought in 3Sum, first sort the array, then fix the first element and use 3Sum on the rest of the array.
2. Record the current first element, and remember it is different from the current i of 3sum. Except it is the start. So the final result in the list should be nums[startIndex - 1], nums[i], nums[lo], nums[hi].
