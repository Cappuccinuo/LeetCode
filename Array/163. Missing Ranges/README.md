Time spent :  20 min(Self)

GIVEN: Given a sorted integer array **nums**,where the range of elements are in the **inclusive range** **[lower, upper]**

RETURNS:missing ranges

EXAMPLES:

```
Input: nums = [0, 1, 3, 50, 75], lower = 0 and upper = 99,
Output: ["2", "4->49", "51->74", "76->99"]
```

Algorithm:

Control the start point. That means, 

traverse the nums array, init the start as lower - 1.

1. If nums[i] == lower - 1, just like in example, we make start to nums[i].
2. If start + 1 == nums[i] - 1, for example, start = 1, nums[i] = 3, we just add "2"
3. If start + 1 > nums[i] - 1, like 4, 4, we jump over this case.
4. Else, we add(start + 1 -> nums[i] - 1)

At 2, 3, 4 step, we need to update start.

At last, if start < upper, for example, start = 75, upper = 99, we add (76, 99)