Time spent : 15 min (See a little hint)

GIVEN: Given an array *S* of *n* integers, a target

RETURNS: the number of triplets which sums are less than the target

EXAMPLES:

Input: 

```
nums = [-2, 0, 1, 3], and target = 2.
```

Output: 2

```
[-2, 0, 1]
[-2, 0, 3]
```

DESIGN STRATEGY: Two Pointers



1. First sort the nums array.

2. Run through all indices of a possible first element of a triplet. Then compare needSum with currentSum.

3. ```
   [1, 2, 3, 5, 8]
    ↑        ↑
   left    right
   Now the pair sum is 1 + 5 = 6, which is < target. How many pairs with one of the index = left that satisfy the condition? You can tell by the difference between right and left which is 3, namely (1,2), (1,3), and (1,5). Therefore, we move left one step to its right.
   So if (currentSum = nums[lo] + nums[hi] < target - nums[i]), count += hi - lo. lo++.
   Otherwise hi--
   ```

