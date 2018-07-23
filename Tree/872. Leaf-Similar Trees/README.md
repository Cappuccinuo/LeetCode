Time spent :  5 min(self)

GIVEN: Two binary trees

RETURNS: true iff the two given trees with head nodes root1 and root2 are leaf-similar 

Note:

Consider all the leaves of a binary tree.  From left to right order, the values of those leaves form a *leaf value sequence.*

![img](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/16/tree.png)

For example, in the given tree above, the leaf value sequence is `(6, 7, 4, 9, 8)`.

Two binary trees are considered *leaf-similar* if their leaf value sequence is the same.



Algorithm:

DFS to get all the leaf in list, and compare if two lists are equal