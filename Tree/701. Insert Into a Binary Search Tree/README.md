Time spent :  5 min(Self)

GIVEN: TreeNode root and a value not in tree

RETURNS: the tree after insert the value

EXAMPLES:

```
Given the tree:
        4
       / \
      2   7
     / \
    1   3
And the value to insert: 5
```

You can return this binary search tree:

```
         4
       /   \
      2     7
     / \   /
    1   3 5
```

This tree is also valid:

```
         5
       /   \
      2     7
     / \   
    1   3
         \
          4
```

Algorithm:

Using the property of BST. Find the parent of the node, and insert it to parent.left or parent.right.