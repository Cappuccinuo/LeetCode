Time spent :  15 min(See hint)

GIVEN: Binary Tree

RETURNS: length of Longest Consecutive Path in Binary Tree

EXAMPLES:

**Example 1:**

```
Input:
        1
       / \
      2   3
Output: 2
Explanation: The longest consecutive path is [1, 2] or [2, 1].
```

 

**Example 2:**

```
Input:
        2
       / \
      1   3
Output: 3
Explanation: The longest consecutive path is [1, 2, 3] or [3, 2, 1].
```

Algorithm:

We use a helper function.It returns int[2] array.

array[0] is the decreasing path with max value of root, array[1] is increasing path with max value of root.

So if we know left[] and right[], the result will be max of left[0] + right[1] + 1 or left[1] + right[0] + 1