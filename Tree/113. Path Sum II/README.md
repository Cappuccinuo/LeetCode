Time spent : 15 min

GIVEN: a TreeNode and a sum

RETURNS: all root-to-leaf paths where each path's sum equals the given sum.

**Example:**

Given the below binary tree and `sum = 22`,

```
      5
     / \
    4   8
   /   / \
  11  13  4
 /  \    / \
7    2  5   1
```

Return:

```
[
   [5,4,11,2],
   [5,8,4,5]
]
```

Using backtracking. The procedure is 5 -> 4 -> 11 -> 7   => 5 -> 4 -> 11 => 5 -> 4 -> 11 -> 2 ...