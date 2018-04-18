Time spent : 10 min(see little hint)

GIVEN: a binary search tree and a node in it

RETURNS: in-order successor of that node in the BST

EXAMPLES:

Input: 

```
    3
   / \
  9  20
    /  \
   15   7    and 15
```

Output: 20

Use the property of binary search tree. If p.val < root.val, we go left subtree, we need to record the root in this situation, If p.val >= root.val, we go right subtree.

If the node's right is null, just return the node we record before.

Otherwise go to the leftmost of node's right.