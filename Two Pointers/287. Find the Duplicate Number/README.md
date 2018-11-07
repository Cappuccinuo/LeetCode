Time spent : 15 min (Self)

GIVEN: an array nums containing n + 1 integers where each integer is between 1 and n (inclusive)

RETURNS: the duplicate number

EXAMPLES:

Input: 

```
nums = [1, 5, 4, 3, 2, 3]
```

Output: 3

DESIGN STRATEGY: Two Pointers



We can use the slow fast pointer similar to find entrance of cycle list.

1. slow and fast are initiated as nums[0]
2. we update slow as nums[slow], fast as nums[nums[fast]] while slow is not equal to fast
3. When they are equal, we update slow as nums[0], and move slow, fast at same pace every time, when they are equal, the equal num is the result.



1. First sort the array.
2. Two pointers lo and hi . Compare nums[lo] and nums[lo + 1] as well as nums[hi] and nums[hi - 1]. If the same, return nums[lo] or nums[hi]. Otherwise, lo++, hi—.

