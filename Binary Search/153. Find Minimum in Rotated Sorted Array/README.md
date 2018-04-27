Time spent : 15 min(See hint)

GIVEN: a rotated sorted array

RETURNS: the minimum element

EXAMPLES:

Input: 

```
[0,1,2,4,5,6,7]
```

Output: [4,5,6,7,0,1,2]

DESIGN STRATEGY: Binary Search



1. Make the last element as the target
2. If current number is less than target, make end to be mid, else make start to be mid.
3. The element is narrowed down to start and end. If start is less or equal to target, than return nums[start], otherwise return nums[end].
