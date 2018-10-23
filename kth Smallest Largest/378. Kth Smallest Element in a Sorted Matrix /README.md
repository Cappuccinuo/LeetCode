Time spent : 20 min(see hint)

GIVEN: a n * n matrix where each of the rows and columns are sorted in ascending order

RETURNS: the kth smallest element in the matrix

**Example:**

```
matrix = [
   [ 1,  5,  9],
   [10, 11, 13],
   [12, 13, 15]
],
k = 8,

return 13.
```



1. As the matrix is already sorted for each row and each column, then the smallest number is matrix\[0][0]. The second smallest number is either matrix\[0][1] or matrix\[1][0]. We traverse from (0, 0), using an array to record the visited point. Each time we push the possible next smallest number(x + 1, y) (x, y + 1). If the number's position is valid and is not visited, mark it as visited and offer it in the heap. At last, we return the peak of the heap.