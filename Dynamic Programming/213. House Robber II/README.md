Time spent : 15 min(See hint)

GIVEN: an integer array nums

RETURNS: maximum sum, which cannot add adjacent integer

Note: the array is a circle, so first is neighbour of last

EXAMPLES:

Input: 

```
[1,2,3]
```

Output: 3

This problem is like the maximum circular array sum problem. The only problem is if we use the property of circle. So we can split the problem to if we rob first, we cannot rob last, same applies to rob last. 

So our problem transfer to Math.max(robFrom(nums, 1, n - 1), robFrom(nums, 0, n - 2))