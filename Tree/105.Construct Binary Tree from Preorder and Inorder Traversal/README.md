Time spent : 50 min (See hint)

GIVEN: preorder traversal array and inorder traversal array of a binary tree

RETURN: the binary tree

EXAMPLES:

Input: 

```
pre: 1-2-4-5-3-6-7
in : 4-2-5-1-6-3-7
```

Output: 1-2-3-4-5-6-7



1. The first value of pre is the root. We find the root val in inorder array, the index is 3. So the index from 0 - 2 is root's left tree, and index from 4 - 6 is root's right tree. Keep finding root in pre, use recursion to construct the tree.