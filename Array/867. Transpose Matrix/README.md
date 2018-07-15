Time spent :  5 min(self)

GIVEN: a matrix A

RETURNS: the transpose of A

EXAMPLES:

**Example 1:**

```
Input: [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
```

**Example 2:**

```
Input: [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]
```

Algorithm:

int\[][] B = new int\[A[0].length]\[A.length]

B\[i][j] = A\[j][i] 