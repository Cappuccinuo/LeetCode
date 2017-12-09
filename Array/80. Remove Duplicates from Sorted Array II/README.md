Time spent : 10 min(See other's thought)



GIVEN: a sorted array

RETURNS: length, with every number no more than twice occurance



EXAMPLES:

Input: 

```
[1, 1, 1, 2, 2, 3]
```

Output: 5, with the first elements of nums being 1, 1, 2, 2, and 3



DESIGN STRATEGY: 

Run through the nums array, if the number's index is 1, 2, nums[i++] = n.

If n > nums[i - 2], that means no more than two n. nums[i++] = n. 