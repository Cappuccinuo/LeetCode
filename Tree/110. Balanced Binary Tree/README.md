Time spent : 15 min

Solution : TreeNode -> Boolean	

GIVEN: a TreeNode

RETURNS: true iff the given tree is height-balanced

NOTE: a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

EXAMPLES:

Input: 

```
[1,2,2,3,null,null,3,4,null,null,4]
```

Output: false

DESIGN STRATEGY: General Recursion



1. The depth of one tree can use recursion to get.
2. if the abs difference between the left tree depth and right tree depth <= 1, than the tree is height-balanced
3.  judge isBalanced(root.right) && isBalanced(root.left)
