Time spent :  10 min(See hint)

GIVEN: An array of integers

RETURNS: How many pairs in the array such that their sum is less than or equal to a specific target number.

EXAMPLES:

Given nums = `[2, 7, 11, 15]`, target = `24`.
Return `5`.
2 + 7 < 24
2 + 11 < 24
2 + 15 < 24
7 + 11 < 24
7 + 15 < 25

Algorithm:

Using opposite pointers. Start locates at 0, end locates at nums.length - 1. If nums[start] + nums[end] is larger than target, that means the end position should be move left so that the sum can be less. Else if their sum is equal or less than target, then the number from start + 1 to end, can have desire sum with number at start, for example, 2,7/2,11/2,15. Then we move start to right.