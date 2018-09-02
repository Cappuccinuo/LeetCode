Time spent :  10 min(See hint)

GIVEN: an array A of non-negative integers

RETURNS: the number of possible results

Note: For every (contiguous) subarray `B = [A[i], A[i+1], ..., A[j]]` (with `i <= j`), we take the bitwise OR of all the elements in `B`, obtaining a result `A[i] | A[i+1] | ... | A[j]`.

EXAMPLES:

**Example 1:**

```
Input: [0]
Output: 1
Explanation: 
There is only one possible result: 0.
```

**Example 2:**

```
Input: [1,1,2]
Output: 3
Explanation: 
The possible subarrays are [1], [1], [2], [1, 1], [1, 2], [1, 1, 2].
These yield the results 1, 1, 2, 1, 3, 3.
There are 3 unique values, so the answer is 3.
```

**Example 3:**

```
Input: [1,2,4]
Output: 6
Explanation: 
The possible results are 1, 2, 3, 4, 6, and 7.
```

Algorithm:

result(i, j+1) = result(i, j) | A[j+1]