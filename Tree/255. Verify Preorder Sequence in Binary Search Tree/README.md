Time spent : 20min (see hint)

GIVEN: an array of numbers

RETURNS: true if it is the correct preorder traversal sequence of a binary search tree

Consider the following binary search tree: 

```
     5
    / \
   2   6
  / \
 1   3
```

**Example 1:**

```
Input: [5,2,6,1,3]
Output: false
```

**Example 2:**

```
Input: [5,2,1,3,6]
Output: true
```



Kinda simulate the traversal, keeping a stack of nodes (just their values) of which we're still in the left subtree. If the next number is smaller than the last stack value, then we're still in the left subtree of all stack nodes, so just push the new one onto the stack. But before that, pop all smaller ancestor values, as we must now be in their right subtrees (or even further, in the right subtree of an ancestor). Also, use the popped values as a lower bound, since being in their right subtree means we must never come across a smaller number anymore.

Reference: https://leetcode.com/problems/verify-preorder-sequence-in-binary-search-tree/discuss/68142