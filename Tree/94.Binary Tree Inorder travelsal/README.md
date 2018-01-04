Inorder traversal : left - root - right



Use a stack to store the treeNode.

Assign root to current, when the current is not null, go deep to the leftmost treenode, simultaneously push each current to the stack.

When reach to the end, pop the stack and add its val to result list. Make current as current.right.

