Time spent : 10 min(self)

GIVEN: an array

RETURNS: rearrange numbers into the lexicographically next greater permutation of numbers

If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

EXAMPLES:

`1,2,3` → `1,3,2`
`3,2,1` → `1,2,3`
`1,1,5` → `1,5,1`

[Algorithm][https://leetcode.com/problems/global-and-local-inversions/solution/]:

1. Traverse the array from right to left, find the first index i, that num[i] > nums[i - 1] or i == 0.
2. When i is not 0, use j to traverse from right to left again, find the first index j that nums[j] > nums[i - 1], then exchange nums[j] and nums[i - 1].
3. Reverse the nums from i to the end of array.

