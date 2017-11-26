Time spent : 15 min

GIVEN: a TreeNode and a sum

RETURNS: true if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

EXAMPLES:

Input: 

```
               5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1

sum = 22
```

Output: True, 5->4->11->2

Use DFS, if the TreeNode is a leaf(root.left and root.right is null) and sum - root.val == 0, then there is a path.

Otherwise self-recursion, using hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val)