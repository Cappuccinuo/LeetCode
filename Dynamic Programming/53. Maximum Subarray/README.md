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



-9 -2 18 7 -6 4 9 -9 -5 0 5 -2 5 9 7

If max = -9, dp[0] = -9. Then dp[1] = -2, cause dp[0] < 0, max = -2.

Then dp[2] = 18, cause dp[1] = -2 < 0, max = 18….