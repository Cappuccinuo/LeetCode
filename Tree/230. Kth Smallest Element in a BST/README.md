Time spent : 15 min(Self)

GIVEN: a binary tree

RETURNS: the kthSmallest element



Inorder traversal:

1. Keep a cursor to record current 'k', for us to tell if current element is kth element.
2. In the inorder method, when the cursor is k, we change the global result to the root's val. Every time we need to move cursor.