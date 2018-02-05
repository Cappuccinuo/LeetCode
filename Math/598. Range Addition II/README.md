Time spent : 5 min (see hint)

GIVEN: Given an m * n matrix **M** initialized with all **0**'s and several update operations.

RETURNS: count and return the number of maximum integers in the matrix after performing all the operations.

EXAMPLES:

```
Input: 
m = 3, n = 3
operations = [[2,2],[3,3]]
Output: 4
Explanation: 
Initially, M = 
[[0, 0, 0],
 [0, 0, 0],
 [0, 0, 0]]

After performing [2,2], M = 
[[1, 1, 0],
 [1, 1, 0],
 [0, 0, 0]]

After performing [3,3], M = 
[[2, 2, 1],
 [2, 2, 1],
 [1, 1, 1]]

So the maximum integer in M is 2, and there are four of it in M. So return 4.
```



We just need to check the min operation to row, and min operation to col. Pay attention that it is not the product of one operation, the min operation may spread in two operations.