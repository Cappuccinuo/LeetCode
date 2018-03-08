Time spent : 10 min (self)

GIVEN: a TreeNode and a target value

RETURNS: the value in the BST that is closest to the target



Solution 1:

Use Inorder traversal. Keep track of closest difference and the treenode.

Solution 2:

Use property of binary search tree: root is bigger than left subtree, smaller than right subtree.