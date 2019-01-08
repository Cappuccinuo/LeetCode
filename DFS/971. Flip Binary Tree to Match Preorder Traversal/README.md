Time spent :  5 min(See hint)

GIVEN: a binary tree with N nodes, each node has a different value from {1, ..., N} Our goal is to flip the **least number** of nodes in the tree so that the voyage of the tree matches the `voyage` we are given.

RETURNS: return a list of the values of all nodes flipped.If we cannot do so, then return the list `[-1]`.

EXAMPLES:

**Example 1:**

**![img](https://assets.leetcode.com/uploads/2019/01/02/1219-01.png)**

```
Input: root = [1,2], voyage = [2,1]
Output: [-1]
```

**Example 2:**

**![img](https://assets.leetcode.com/uploads/2019/01/02/1219-02.png)**

```
Input: root = [1,2,3], voyage = [1,3,2]
Output: [1]
```

**Example 3:**

**![img](https://assets.leetcode.com/uploads/2019/01/02/1219-02.png)**

```
Input: root = [1,2,3], voyage = [1,2,3]
Output: []
```

Algorithm:

Do DFS, if any node's value doesn't match the voyage, return [-1].

Otherwise, compare the next value in voyage with next child, do the flip if necessary.