Time spent :  15 min(See hint)

GIVEN: A two dimensional matrix A where each value is 0 or 1

RETURNS: the highest possible score

Note:

A move consists of choosing any row or column, and toggling each value in that row or column: changing all `0`s to `1`s, and all `1`s to `0`s.

After making any number of moves, every row of this matrix is interpreted as a binary number, and the score of the matrix is the sum of these numbers.

EXAMPLES:

```
Input: [[0,0,1,1],[1,0,1,0],[1,1,0,0]]
Output: 39
Explanation:
Toggled to [[1,1,1,1],[1,0,0,1],[1,1,1,1]].
0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39
```

Reference: https://leetcode.com/problems/score-after-flipping-matrix/solution/

**Intuition**

Notice that a `1` in the iith column from the right, contributes 2^{i} to the score.

Since 2^n>2^n−1+2^n−2+⋯+2^0, maximizing the left-most digit is more important than any other digit. Thus, the rows should be toggled such that the left-most column is either all `0` or all `1` (so that after toggling the left-most column [if necessary], the left column is all `1`.)

**Algorithm**

If we toggle rows by the first column (`A[r][c] ^= A[r][0]`), then the first column will be all `0`.

Afterwards, the base score is `max(col, R - col)` where `col` is the column sum; and `(1 << (C-1-c))` is the power of 2 that each `1` in that column contributes to the score.