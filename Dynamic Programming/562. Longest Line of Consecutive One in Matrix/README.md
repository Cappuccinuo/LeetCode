Time spent :  20 min(Self)

GIVEN: 01 matrix M

RETURNS: the longest line of consecutive one in the matrix. The line could be horizontal, vertical, diagonal or anti-diagonal.

EXAMPLES: 

**Example:**

```
Input:
[[0,1,1,0],
 [0,1,1,0],
 [0,0,0,1]]
Output: 3
```

Algorithm:

Update each direction based on previous row.

Row, Col, Diag, Anti-Diag.