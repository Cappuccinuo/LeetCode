Time spent : 15 min(self)

GIVEN: a binary tree with three field, left, right, next

EFFECTL: populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

For example,
Given the following perfect binary tree,

```
         1
       /  \
      2    3
     / \  / \
    4  5  6  7
```

After calling your function, the tree should look like:

```
         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \  / \
    4->5->6->7 -> NULL
```



1. Using no constant space: level order traversal
2. DFS: top-down, if root.left is not null, root.left.next is root.right, if root.next is not null, root.right.next = root.next.left. Then call function to root.left, root.right.
3. BFS: when root is not null, go through this level.