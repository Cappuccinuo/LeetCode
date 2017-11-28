Time spent : 20 min

GIVEN: a list of integer list

RETURNS: the maximum difference between two integers from two different arrays



EXAMPLES:

Input: 

```
[[1,2,3],
 [4,5],
 [1,2,3]]
```

Output: 4

DESIGN STRATEGY: 

Since the arrays are already sorted, we don't need to compare every element of the arrays.

The two points being considered for the distance calculation should not both belong to the same array.

Thus, for arrays a and b currently chosen, we can just find the maximum out of a[n - 1] - b[0] and b[m - 1] - a[0] to find the larger distance.

And we keep a track of the element with minimum value and the one with maximum value found so far.