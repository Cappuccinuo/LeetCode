Time spent : 5 min(see hint)

GIVEN: an array

RETURNS: contiguous subarray's minimum sum

EXAMPLES:

Input: 

```
[1, -1, -2, 1]
```

Output: -3



Same idea with maximum subarray. Calculate the prefix sum for every num, and update min as min or sum, and update sum as Math.min(sum, 0). Cause we don't want to add positive numbers.