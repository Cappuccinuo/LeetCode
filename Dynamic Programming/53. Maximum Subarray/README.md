Time spent : 25 min(see hint)

GIVEN: an array

RETURNS: contiguous subarray's largest sum

EXAMPLES:

Input: 

```
[-2,1,-3,4,-1,2,1,-5,4]
```

Output: 6 ([4, -1, 2, 1])



1. if current sum is smaller than 0, use nums[i]; otherwise sum = sum + nums[i]
2. if the sum is larger than result, result = sum