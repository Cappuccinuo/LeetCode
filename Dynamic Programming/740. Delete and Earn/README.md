Time spent : 20 min

Solution : IntegerArray -> Integer

GIVEN: an integer array nums

RETURNS: maximum number of points you can earn by applying such operations

Note : In each operation, you pick any `nums[i]` and delete it to earn `nums[i]` points. After, you must delete **every** element equal to `nums[i] - 1` or `nums[i] + 1`.

EXAMPLES:

```
Input: nums = [3, 4, 2]
Output: 6
Explanation: 
Delete 4 to earn 4 points, consequently 3 is also deleted.
Then, delete 2 to earn 2 points. 6 total points are earned.

Input: nums = [2, 2, 3, 3, 3, 4]
Output: 9
Explanation: 
Delete 3 to earn 3 points, deleting both 2's and the 4.
Then, delete 3 again to earn 3 points, and 3 again to earn 3 points.
9 total points are earned.
```

Design strategy: Dynamic Programming

Based on 198. House Rubber.

The only thing we need to do is transfer the nums array to a dict array, that means, add the same number together, [2, 2, 3, 3, 3, 4] -> values[2] = 4, values[3] = 9, values[4] = 4, in that way, we make a house array.

