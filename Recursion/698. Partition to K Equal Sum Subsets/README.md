Time spent :  20 min(See hint)

GIVEN: an array of integers, a positive integer k

RETURNS: true if it's possible to divide this array into `k` non-empty subsets whose sums are all equal.

EXAMPLES: 

```
Input: nums = [4, 3, 2, 3, 5, 2, 1], k = 4
Output: True
Explanation: It's possible to divide it into 4 subsets (5), (1, 4), (2,3), (2,3) with equal sums.
```

Algorithm:

Firstly, we can get the sum of the nums array. The subset sum will be target = sum(nums) / k. If sum(nums) % k is not 0, return false. 

Here we can use a trick to speed up, that is sort the array nums. If the last number is larger than target, return false. Let row = nums.length - 1, while row is larger than 0 and nums[row] == target, row-- and k--. 

For each number in `nums`, we could add it into one of `k` group-sums, as long as the group's sum would not exceed the `target`. For each of these choices, we recursively search with one less number to consider in `nums`. If we placed every number successfully, then our search was successful.