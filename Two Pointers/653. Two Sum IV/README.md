Time spent : 5 min

Solution : Use inorder of BST

GIVEN: a TreeNode and a target

RETURNS: true if there exist two elements in the BST such that their sum is equal to the given target.

EXAMPLES:

Input: 

```
    5
   / \
  3   6
 / \   \
2   4   7

Target = 9
```

Output: True

Input:

```
Input: 
    5
   / \
  3   6
 / \   \
2   4   7

Target = 28
```

Output: False



**Algorithm**

In this approach, we make use of the fact that the given tree is a Binary Search Tree. Now, we know that the inorder traversal of a BST gives the nodes in ascending order. Thus, we do the inorder traversal of the given tree and put the results in a listlist which contains the nodes sorted in ascending order.

First put all the node's value in a list. (In-order traverse).

Then use binary search.