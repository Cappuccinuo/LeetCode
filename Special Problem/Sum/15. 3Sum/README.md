Time spent : 40 min (See other's thought)

GIVEN: Given an array *S* of *n* integers

RETURNS: all unique triplets in the array which gives the sum of zero.

EXAMPLES:

Input: 

```
S = [-1, 0, 1, 2, -1, -4]
```

Output: [  [-1, 0, 1],  [-1, -1, 2]]



DESIGN STRATEGY: Two Pointers



1. First sort the nums array.
2. Run through all indices of a possible first element of a triplet. For each possible first element make a standard bi-directional 2-sum sweep of the remaining part of the array.
3. Also we need to skip equal elements to avoid duplicates.
