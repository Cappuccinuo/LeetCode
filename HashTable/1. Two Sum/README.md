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

It turns out we can do it in one-pass. While we iterate and inserting elements into the table, we also look back to check if current element's complement already exists in the table. If it exists, we have found a solution and return immediately.

1. It is not workable when put index + nums[i] or nums[i] + index into the map first, then go through again. And it is not workable when first sort array then do the binary search.
2. So we need to do the one pass, that means, search and put the nums[i] into the hashmap simultaneously. 
3. First calculate the sum we need, target - nums[i], if the map has the needSum key, we get the result. Otherwise, put nums[i], i into hashmap.



**Complexity Analysis:**

- Time complexity : O(n). We traverse the list containing nn elements only once. Each look up in the table costs only O(1) time.
- Space complexity : O(n). The extra space required depends on the number of items stored in the hash table, which stores at most n elements.

