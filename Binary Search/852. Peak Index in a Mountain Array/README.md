Time spent :  5 min(Self)

GIVEN: An array A, a *mountain* if the following properties hold:

- `A.length >= 3`
- There exists some `0 < i < A.length - 1` such that `A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]`

RETURNS: return any `i` such that `A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]`.

EXAMPLES:

**Example 1:**

```
Input: [0,1,0]
Output: 1
```

**Example 2:**

```
Input: [0,2,1,0]
Output: 1
```

Algorithm:

Binary search from 1 to len - 2.

If A[mid] > A[mid + 1], end = mid, else start = mid.