Time spent : 15 min(See hint)

GIVEN: an integer array nums

RETURNS: maximum sum, which cannot add adjacent integer

Note: the array is a circle

EXAMPLES:

Input: 

```
[1,2,3]
```

Output: 3



We only need to specific the rob range. The first one and the last one cannot be robbed at the same time. So the range is 1, n - 1 or 0, n - 2. Pick the larger one.