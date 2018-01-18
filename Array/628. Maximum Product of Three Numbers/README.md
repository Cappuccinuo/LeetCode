Time spent : 10 min(self)

GIVEN: an integer of array

RETURNS: three numbers whose product is maximum and output the maximum product.



EXAMPLES:

```
Input: [1,2,3]
Output: 6
```

```
Input: [1,2,3,4]
Output: 24
```

DESIGN STRATEGY: 

1. Sort the array, and pick the max of first 3 numbers and first 2 numbers * last number.

2. The same idea with the problem that find the 2nd smallest integer, find the 3rd largest integer problem.

   We can use linear scan to find the max 3 numbers and min 2 numbers.