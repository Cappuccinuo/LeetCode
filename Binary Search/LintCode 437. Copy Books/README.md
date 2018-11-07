Time spent :  15 min(Self)

GIVEN: n books and the ith book has A[i] page, given k people to copy the n books

RETURNS: the best strategy to assign books so that the slowest copier can finish at earliest time

**Example 1:**

```
Given array A = [3,2,4], k = 2.

Return 5( First person spends 5 minutes to copy book 1 and book 2 and second person spends 4 minutes to copy book 3. )
```

Algorithm:

The problem can be actually interpreted as find the first position that can finish the copy. For the example above,

​       1 2 3 4                 5 6 7 8

___cannot finish___ ____  __canfinish__

The first position is 5.

