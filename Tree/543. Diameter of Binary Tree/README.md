Time spent : 10min (self)

GIVEN: a TreeNode

RETURNS: the diameter of the tree

Note: the diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

EXAMPLES:

```
Input:    1
         / \
        2   3
       / \     
      4   5    

Output: 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
```



Solution : DFS (Same idea with LC124)

We can find that for every node, there is a chance that the diameter of the node is the longest. And all the diameter is one of the leaf of left subtree to one of the leaf of right subtree. So we just need to know the diameter of root's left node and right node, that is the depth of a node, the usual way is max(depth of node.left, depth of node.right) + 1. A path through this node is 1 + depth of node.left + depth of node.right.

The max needs to be global.