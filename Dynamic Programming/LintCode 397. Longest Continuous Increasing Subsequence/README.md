Time spent :  10 min(See hint)

GIVEN: An integer array

RETURNS: the longest increasing continuous subsequence in this array

Note: An increasing continuous subsequence:

- Can be from right to left or from left to right.
- Indices of the integers in the subsequence should be continuous.

**Example 1:**

```
For [5, 4, 2, 1, 3], the LICS is [5, 4, 2, 1], return 4.
```

**Example 2:**

```
For [5, 1, 2, 3, 4], the LICS is [1, 2, 3, 4], return 4.
```

 

Algorithm:

Using the method of 打擂台. This cost O(2n). First loop we find the number of increasing count. Second we find the number of decreasing count. 

Or we can just use one for loop. If A[i] > A[i - 1] we increase increaseCount, and set decreaseCount 1. If A[i] < A[i - 1], we increase decreaseCount, and set increaseCount 1. Otherwise we set them 1.