Time spent : 10 min(Self)

GIVEN: a collection of integers that might contain duplicates

RETURNS: all possible subsets

**Example:**

```
Input: [1,2,2]
Output:
[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]
```

Algorithm:

In subsets problem, as it does not contain duplicate, so we don't need to care about condition like [4, 4, 4, 1, 4] that can have result like [4, 1] [4, 1] [4, 1]...

To reduce duplicate, we just need to know, if previous has one digit 4, we can jump same condition. Like [4, 4, 1], when we traverse the first 4, we get [4], [4, 4], [4, 4, 1], [4, 1]. When we get to the second 4, we check if this traverse is from last 4, if yes, then we don't need to jump, cause [4, 4, 1] will not have duplicate [4, 4, 1]. But what about [4, 1], if previous 4 has traverse to 1, then we can continue.

So the logic behind this is that, if nums[i] == nums[i - 1], and !visited[i - 1], representing we have finish the previous traverse, then we continue. This require sorting nums first.