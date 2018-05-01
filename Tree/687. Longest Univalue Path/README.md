Time spent : 25min (self)

GIVEN: a binary search TreeNode with duplicates

RETURNS: the most frequently occurred element in the given BST

Note:

Assume a BST is defined as follows:

- The left subtree of a node contains only nodes with keys **less than or equal to** the node's key.
- The right subtree of a node contains only nodes with keys **greater than or equal to** the node's key.
- Both the left and right subtrees must also be binary search trees.

For example:
Given BST `[1,null,2,2]`,

```
   1
    \
     2
    /
   2

```

return `[2]`.



Solution : Inorder traversal

Keep a prev treenode to compare with current treenode.

Keep a max to indicate current max frequency, keep a freq to indicate current node freqency.

a. When prev is null or prev val is equal to curr val, freq++. Otherwise freq is 1.

b. If freq is larger than max, than max is freq, clear the list and add root's val to the list.

c. If freq is equal to max, than add current root.val to list.

d. change prev to current root.

When move list's val to an array, use a for loop. If use result.stream().mapToInt(i -> i).toArray(), the time increases.