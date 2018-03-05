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

First method we can use is DFS

1. When the root is null, we return 0
2. We only need to pay attention to root's left node, when it comes to root's right node, we treat it as a new root and call the method on root's right.
3. When root.left != null, then judge if the root is a leaf, the method is the judge root.left.left and root.left.right. If it is a leaf, add its val to ans. If it is not leaf, sumOfLeftLeaves(root.left).
4. add sumOfLeftLeaves(root.right) to ans. Treat root.right as a new root.

Second method we can use is BFS

1. Initiate queue and offer root to the queue.
2. The hard part is how to tell whether a node is left leaf or right leaf. So for a node, we look deeper for one level, that is we look root.left.left, root.left.right, only when they are both null, we add the value. Otherwise we offer the root to the queue.
3. If root.right is not null, we offer it to the queue.