Time spent : 50 min(See hint)

GIVEN: an array of integers where a[i] is between 1 and n. Some elements appear twice and others appear once.

RETURNS: all the elements that do not appear in the array



EXAMPLES:

Input: 

```
[1,3,3]
```

Output: 2



Iterate through the array and mark elements as negative. nums[nums[i] - 1] = -nums[nums[i] - 1] when nums[nums[i] - 1] > 0. In this way all the member that have seen is negative. Iterate the second time, pick up the one that is still positive, their index + 1 is the numbers that disappeared.