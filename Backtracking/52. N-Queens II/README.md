Time spent : 60 min(See others' thought + Youtube)

GIVEN: N

RETURNS: total number of distinct solutions

https://www.youtube.com/watch?v=xouin83ebxE&index=2&list=PLrmLmBdmIlpslxZUHHWmfOzNn6cA7jvyh

1. We must make sure two queens are not on the same column, same row, same diagonal, so row + col, row - col, col cannot be equal.
2. Use a flag foundSafe to represent current path is valid. If is false, break and go to next column. If is true, recursion to the next row. After that, reset that row.