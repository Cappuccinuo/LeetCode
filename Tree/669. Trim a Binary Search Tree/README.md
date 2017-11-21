Time spent : 15 min

Solution : TreeNode -> Boolean	

GIVEN: a TreeNode, lowest and highest boundaries as L and R

RETURNS: new root of the trimmed binary search tree

EXAMPLES:

```
Input: 
    1
   / \
  0   2

  L = 1
  R = 2

Output: 
    1
      \
       2
```

DESIGN STRATEGY: Recursion



1. If root.val < L, return trimBST(root.right, L, R), if root.val > R, return trimBST(root.left, L, R)
2. If root == null, return root
3. root.left = trimBST(root.left, L, R), root.right = trimBST(root.right, L, R)
