Time spent : 15 min(See solution)	

GIVEN: a TreeNode

RETURNS: a greater tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST

EXAMPLES:

```
Input: The root of a Binary Search Tree like this:
              5
            /   \
           2     13

Output: The root of a Greater Tree like this:
             18
            /   \
          20     13
```

DESIGN STRATEGY: Recursion



Solution 1:

1. We need a integer to record the accumulative sum.
2. First convertBST(root.right), sum += root.val, assign sum to root.val, then convertBST(root.left)

Solution 2:

1. Iniitialize an empty stack and set the current node to the root
2. push all of the nodes along the path to the rightmost leaf onto the stack
3. visit the node on the top of our stack, consider its left subtree
4. Eventually, stack is empty and node points to the left null child of the tree's minimum value node, so the loop terminates