Time spent :  10 min(See hint)

GIVEN: a binary tree

RETURNS: true if it is a complete binary tree

EXAMPLES:

**Example 1:**

**![img](https://assets.leetcode.com/uploads/2018/12/15/complete-binary-tree-1.png)**

```
Input: [1,2,3,4,5,6]
Output: true
Explanation: Every level before the last is full (ie. levels with node-values {1} and {2, 3}), and all nodes in the last level ({4, 5, 6}) are as far left as possible.
```

**Example 2:**

**![img](https://assets.leetcode.com/uploads/2018/12/15/complete-binary-tree-2.png)**

```
Input: [1,2,3,4,5,null,7]
Output: false
Explanation: The node with value 7 isn't as far left as possible.
```

Algorithm:

We need to check the last level of each tree to see if they are left-justified. For a tree if the node is numbered from 1 to n continuously, that tree can be complete tree, otherwise not. So we need to record (depth, position) of each node.

A good way to represent is for left and right child, using index of current node, left is 2 * currentIndex, right is 2 * currentIndex + 1. Then we can use BFS to check if the position of last node in list is equal to list's size.