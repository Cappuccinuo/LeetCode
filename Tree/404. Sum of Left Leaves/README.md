Time spent : 20 min

GIVEN: a TreeNode

RETURNS: sum of all left leaves

EXAMPLES:

Input: 

```
    3
   / \
  9  20
    /  \
   15   7
```

Output: 24

1. root.left != null, then judge if the root is a leaf. If it is a leaf, add its val to ans. If it is not leaf, sumOfLeftLeaves(root.left).
2. add sumOfLeftLeaves(root.right) to ans.