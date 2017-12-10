Time spent : 20 min(self)

Goal : Rotate an array of n elements to the right by k steps

GIVEN: an array of n elements, k steps

RETURNS: nums array after rotate k steps.



EXAMPLES:

Input: 

```
n = 7, k = 3, array:[1, 2, 3, 4, 5, 6, 7]
```

Output: [5, 6, 7, 1, 2, 3, 4]

DESIGN STRATEGY: 

Solution 1:

1. If k == len, equals to no rotation. If k > len, k = k % len.
2. New a arraylist result, result.add(nums[len-k, … len]), result.add(nums[0, … len-k - 1])

