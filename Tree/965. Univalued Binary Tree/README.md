Time spent :  5 min(Self)

GIVEN: a binary tree

RETURNS: true if and only if the given tree is univalued

EXAMPLES: 

**Example 1:**

![img](https://assets.leetcode.com/uploads/2018/12/28/unival_bst_1.png)

```
Input: [1,1,1,1,1,null,1]
Output: true
```

**Example 2:**

![img](https://assets.leetcode.com/uploads/2018/12/28/unival_bst_2.png)

```
Input: [2,2,2,5,2]
Output: false
```

Algorithm:

Using DFS to traverse the tree, and keep record of previous value, compare with current root val.

Time complexity is O(N).