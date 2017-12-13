Time spent : 30 min

Solution : HashMap	

GIVEN : an array of integers, and an integer target

RETURNS : indices of the two numbers such that they add up to a specific target 

EXAMPLES:

```
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```

DESIGN STRATEGY: HashMap



1. It is not workable when put index + nums[i] or nums[i] + index into the map first, then go through again. And it is not workable when first sort array then do the binary search.
2. So we need to do the one pass, that means, search and put the nums[i] into the hashmap simultaneously. 
3. First calculate the sum we need, target - nums[i], if the map has the needSum key, we get the result. Otherwise, put nums[i], i into hashmap.

