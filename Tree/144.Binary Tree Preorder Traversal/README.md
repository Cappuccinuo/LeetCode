Inorder traversal : root-left-right



Use a stack to store the treeNode.

Remember to judge if root is null.

Push root to the stack. Add stack's top's val to result. If top.left != null or top.right != null, add left or right.

