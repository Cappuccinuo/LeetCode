Time spent : 15 min (See hint)

GIVEN: a binary tree

RETURN: shortest path from the root node down to the nearest leaf node



Recursion:

If root is null, return 0.

If left and right node is null, return 1.

If left is null, return minDepth(root.right) + 1

If right is null, return minDepth(root.left) + 1

Otherwise return Math.min(minDepth(root.right), minDepth(root.left)) + 1



Iterative:

Use a queue. Go through level by level. Use queue.size() to control the loop.