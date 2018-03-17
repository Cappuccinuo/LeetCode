Time spent : 20 min (see hint)

GIVEN: a TreeNode

RETURNS: the number of uni-value subtrees

For example:
Given binary tree,

```
              5
             / \
            1   *5
           / \   \
          *5  *5  *5
```

return `4`.

Bottom-up

All the leaf node is uni-value subtrees.

First make a global variable result.

countHelper is to judge if tree is unival.

If root is null, return true. When the recursion terminates, all leaf node is true.

When left subtree is unival and right subtree is unival,

​	if node is leaf node, result++

​	if left or right node is not null while not equal to root's val, return false

Use & when judge left and right tree, so that both the recursion can execute.