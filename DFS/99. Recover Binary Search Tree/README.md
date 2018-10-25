Time spent :  15 min(See hint)

GIVEN: BST treenode

EFFECTS: Recover the tree without changing its structure

EXAMPLES: 

**Example 1:**

```
Input: [1,3,null,null,2]

   1
  /
 3
  \
   2

Output: [3,1,null,null,2]

   3
  /
 1
  \
   2
```

**Example 2:**

```
Input: [3,1,4,null,null,2]

  3
 / \
1   4
   /
  2

Output: [2,1,4,null,null,3]

  2
 / \
1   4
   /
  3
```

Algorithm:

We conduct inorder traversal on the tree, and keep three field: first and second to record the two treenode that need to swap. And prev to record previous value.

For 1,4,3,2,5,6

1.When we read 4, we know it is right order, no move.

2.When we read 3, it is reverse order 4,3, so 4 is the first wrong node, 3 is the second wrong node.

3.When we read 2, it is reverse order, we update 2 as second wrong node. Why update 2 as the second?

Use Contradiction to prove:

Assume: 3 is swap from following node. 

Theory: 4>3, then 4 is also swap from following node. 

Contradiction: 3 wrong number.

So 4 is definitely swap from back. We only need to update second.

At last, we swap the value of first and second.