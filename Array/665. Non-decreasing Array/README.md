Time spent : 20 min(See hint)

GIVEN: an array with n integers

RETURNS: check if it could become non-decreasing by modifying at most 1 element.

**Example 1:**

```
Input: [4,2,3]
Output: True
Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
```

**Example 2:**

```
Input: [4,2,1]
Output: False
Explanation: You can't get a non-decreasing array by modify at most one element.
```



This problem has many corner case. Like [3, 4, 2, 3], it has only one nums[i - 1] >= nums[i], while it cannot become non-decreasing by modifying at most 1 element.