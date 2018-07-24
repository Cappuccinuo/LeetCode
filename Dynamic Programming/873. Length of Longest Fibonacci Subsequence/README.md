Time spent :  20 min(See hint)

GIVEN: A strictly increasing array A of positive integers forming a sequence

RETURNS: the length of the longest fibonacci-like subsequence of A. If not exists, return 0.



**Example 1:**

```
Input: [1,2,3,4,5,6,7,8]
Output: 5
Explanation:
The longest subsequence that is fibonacci-like: [1,2,3,5,8].
```

**Example 2:**

```
Input: [1,3,7,11,12,14,18]
Output: 3
Explanation:
The longest subsequence that is fibonacci-like:
[1,11,12], [3,11,14] or [7,11,18].
```



Algorithm:

Two consecutive terms A[i] and A[j] is like a single node (i, j). The subsequence is a path between these consecutive nodes. Like (1, 2) -> (2, 3) -> (3, 5) -> (5, 8)

two nodes are connected only if A[i] + A[j]  == A[k]. 

Let longest[i, j] be the longest path ending in [i, j]. longest[j, k] = longest[i, j] + 1 if (i, j) and (j, k) are connected.

For i we can get that index by A.index(A[k] - A[j]), then we check for each j < k and update longest[j, k] accordingly.