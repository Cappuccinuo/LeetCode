Time spent :  5 min(Self)

GIVEN: a binary search tree and a node in it. You will have direct access to the node but not to the root of the tree. Each node will have a reference to its parent node.

RETURNS: find the in-order successor of that node in the BST.

EXAMPLES:

<https://leetcode.com/problems/inorder-successor-in-bst-ii/description/>

Algorithm:

With lookup node's value:

check x's right child. If null, we basicly go up to its parent. Notice that when we loop, we need to make sure node's parent is not null. If not null, do typical successor lookup.

Without lookup node's value:

We need to check if current node is its parent left or right child.