Time spent : 20 min(Self)

GIVEN: two-D array

RETURNS: true iff the diagonals elements are all equal

EXAMPLES:

```
Input: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
Output: True
Explanation:
1234
5123
9512

In the above grid, the diagonals are "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]", and in each diagonal all elements are the same, so the answer is True.

```

DESIGN STRATEGY: 

Just go through the array. Check matrix\[i - 1][j - 1] and matrix\[i][j]