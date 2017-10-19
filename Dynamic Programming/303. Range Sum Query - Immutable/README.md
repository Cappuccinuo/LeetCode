Time spent : 20 min

Solution : IntegerArray scope -> Integer

GIVEN: an integer array nums, indices i and j (i <= j)

RETURNS: the sum of the elements between i and j

EXAMPLES:

Input: 

```
["NumArray","sumRange","sumRange","sumRange"]
[[[-2,0,3,-5,2,-1]],[0,2],[2,5],[0,0]]
```

Output: [null,1,-1,-2]

Design strategy: Caching. Cumulate the sum of element in a new array, put the sum of num[0] to num[n], num[0] to num[n+1], … num[0] to num[nums.length - 1] in the array



1. inserted a dummy 0 as the first element in the sum array. So it can save us from an extra conditional check in sumRange.
2. sum[1] = sum[0] + nums[0], sum[2] = sum[1] + nums[1] = nums[0] + nums[1], ...
3. the SumRange of (2, 5) is supposed to be sum[0->5] - sum[0->1], so equals to sum[6] - sum[2]
