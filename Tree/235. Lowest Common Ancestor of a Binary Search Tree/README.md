Time spent : 5 min	(See hint)

GIVEN: a binary search tree, two nodes

RETURNS: the lowest common ancestor of two given nodes

Note:According to the [definition of LCA on Wikipedia](https://en.wikipedia.org/wiki/Lowest_common_ancestor): “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow **a node to be a descendant of itself**).”

EXAMPLES:

```
        _______6______
       /              \
    ___2__          ___8__
   /      \        /      \
   0      _4       7       9
         /  \
         3   5
```

RETURN: nodes 2 and nodes 8 : TreeNode(6)



1. As the tree is a BST, we just need to find if the two nodes are on same subtree.
2. If root.val is larger than two nodes' val, go on to root.left. Otherwise go on to root.right.
