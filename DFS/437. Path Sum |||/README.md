Time spent : 15 min(See other's thought)

Solution : DFS

GIVEN: a TreeNode, and a target sum

RETURNS: number of paths that sum to the given value

EXAMPLES:

```
root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8

      10
     /  \
    5   -3
   / \    \
  3   2   11
 / \   \
3  -2   1

Return 3. The paths that sum to 8 are:

1.  5 -> 3
2.  5 -> 2 -> 1
3. -3 -> 11
```

DESIGN STRATEGY: DFS



1. We need to use a method pathSumFrom, to calculate the paths that from specific root.
2. In pathSumFrom, if the root is null, return 0. If the root.val is sum, return 1. It need to add pathSumFrom(root.left, **sum - root.val**), same for root.right.
3. In pathSum, return pathSumFrom(root, sum) + pathSum(root.left, sum)...
