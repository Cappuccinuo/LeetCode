Time spent : 15 min(Self)

GIVEN: a complete binary tree

RETURNS: the number of nodes

Note: **Definition of a complete binary tree from Wikipedia:**
In a complete binary tree every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.

**Example:**

```
Input: 
    1
   / \
  2   3
 / \  /
4  5 6

Output: 6
```

Algorithm:

A fully completed binary tree nodes = 2^h - 1 nodes.

So our thought should be how can we know if it is completed?

Check leftmost node's depth and rightmost node's depth, if they are equal, the nodes of that subtree is 2 ^ depth - 1.

So the whole tree nodes = 1 + countNodes(root.left) + countNodes(root.right), when the subtree is completed, we can use 2^h - 1 as the result.