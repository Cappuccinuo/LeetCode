Time spent : 10 min(self, first 2 solutions)



GIVEN: an integer array

RETURNS: the kth largest element 

EXAMPLES:

Input: 

```
[3,2,1,5,6,4]
2
```

Output: 

`5`



Solution 1 : just use java library to solve the array   O(N lg N) running time and O(1) memory

Solution 2 : Use the priority queue. Control the pq size based on k.  O(N lg K) running time and O(K) memory

Solution 3 : Quicksort