Time spent : 15 min(See hint)

Solution : DFS

GIVEN: a binary tree

RETURNS: find the lowest common ancestor(LCA)



```
        _______3______
       /              \
    ___5__          ___1__
   /      \        /      \
   6      _2       0       8
         /  \
         7   4
```

For example, the lowest common ancestor (LCA) of nodes `5` and `1` is `3`. Another example is LCA of nodes `5` and `4` is `5`, since a node can be a descendant of itself according to the LCA definition.



We call the function on left child and right child:

1. If the left is not null and right is null, that means the LCA is on left subtree, return that node.
2. If the right is not null and left is null, that means the LCA is on right subtree, return that node.
3. If the left and right are all null, return null.
4. If the left and right are both not null, that means, A and B are on left and right tree respectively. Root is their LCA.
5. So the terminal judgement requirement is when root == null || root == p || root == q.