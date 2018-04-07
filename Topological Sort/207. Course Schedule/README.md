Time spent : 50 min(self)



GIVEN: a total of n courses have to take(labeled from 0 to n - 1). And a prerequisites pairs array, [0, 1] means take course 0 we have to first take course 1.

RETURNS: If we can finish all courses

EXAMPLES:

Input: 

```
2, [[1,0]]
```

Output: 

`True`



This is a typical problem using topological sorting. 

Procedure:

1. Calculate incoming degree of each vertex
2. Put vertex with incoming degree 0 into queue
3. Take vertex from the queue, remove its incoming degree with 1.
4. Put incoming degree 0 vertex in queue.