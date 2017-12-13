Time spent : 25 min (Self)

GIVEN: Given an array *S* of *n* integers, a target

RETURNS: the sum of the three integers that closest to the target.

EXAMPLES:

Input: 

```
S = {-1 2 1 -4} target = 1
```

Output: 2(-1 + 2 + 1 = 2)



DESIGN STRATEGY: Two Pointers



1. First sort the nums array.
2. Run through all indices of a possible first element of a triplet. Then compare currentSum with target.
3. Pay attention to Integer.MAX_VALUE, we need to use long to store the closestSum. Cause **Integer.MAX_VALUE - (- 1) = Integer.MAX_VALUE + 1 = Integer.MIN_VALUE**
