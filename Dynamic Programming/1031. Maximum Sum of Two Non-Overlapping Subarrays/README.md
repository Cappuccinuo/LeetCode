Time spent :  10 min(See hint)

GIVEN: Given an array `A` of non-negative integers

RETURNS: return the maximum sum of elements in two non-overlapping (contiguous) subarrays, which have lengths `L` and `M`

EXAMPLES:

**Example 1:**

```
Input: A = [0,6,5,2,2,5,1,9,4], L = 1, M = 2
Output: 20
Explanation: One choice of subarrays is [9] with length 1, and [6,5] with length 2.
```

**Example 2:**

```
Input: A = [3,8,1,3,2,1,8,9,0], L = 3, M = 2
Output: 29
Explanation: One choice of subarrays is [3,8,1] with length 3, and [8,9] with length 2.
```

**Example 3:**

```
Input: A = [2,1,5,6,0,9,5,0,3,8], L = 4, M = 3
Output: 31
Explanation: One choice of subarrays is [5,6,0,9] with length 4, and [3,8] with length 3.
```

Algorithm:

Sum of subarrays -> need prefixSum array.

If we want to move the window length of M, we need to know the max of length L sum before the current window. Same for length of L.