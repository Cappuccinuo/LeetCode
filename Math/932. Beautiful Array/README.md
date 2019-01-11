Time spent :  10 min(See hint)

GIVEN: Some fixed N

RETURNS: **any** beautiful array `A`.  

Note: an array `A` is *beautiful* if it is a permutation of the integers `1, 2, ..., N`, such that:

For every `i < j`, there is **no** `k` with `i < k < j` such that `A[k] * 2 = A[i] + A[j]`.

EXAMPLES:

**Example 1:**

```
Input: 4
Output: [2,1,4,3]
```

**Example 2:**

```
Input: 5
Output: [3,1,2,5,4]
```

Algorithm:

Divide the array into odd and even parts, cause there is no k that A[k] * 2 = odd + even.