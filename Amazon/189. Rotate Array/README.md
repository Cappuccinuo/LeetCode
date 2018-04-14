Time spent : Solution 1 : 20 min(self)   Solution 2 : 10 min(see solution)

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

Solution 2:

Same as 186. Reverse Words in a String II

First reverse the nums array : [7, 6, 5, 4, 3, 2, 1]

Then reverse 0 - (k - 1)            : [5, 6, 7, 4, 3, 2, 1]

The end reverse k - (len - 1)   : [5, 6, 7, 1, 2, 3, 4]

Solution 3:

Use another array to store.

replace[(i + k) % nums.length] = nums[i]

