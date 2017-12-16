Time spent : 5 min(self)

Solution : DFS

GIVEN: a binary tree

RETURNS: maximum depth of the tree

EXAMPLES:

```
[1,2,3,4,5,6,7,8,9]

Return 4
```

DESIGN STRATEGY: DFS



1. If the root is null, return 0
2. leftDepth is maxDepth(root.left), rightDepth is maxDepth(root.right)
3. return 1 + Math.max(root.left, root.right)
