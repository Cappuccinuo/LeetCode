Time spent :  15 min(See little hint + self)

GIVEN: preorder and postorder traversal

RETURNS: any binary tree that matches the given preorder and postorder traversals

EXAMPLES:

**Example 1:**

```
Input: pre = [1,2,4,5,3,6,7], post = [4,5,2,6,7,3,1]
Output: [1,2,3,4,5,6,7]
```

Algorithm:

Loop on pre array and construct node one by one.

1 2 4 5 3 6 7

We first offer pre[0] to the stack or deque, then loop the pre array, node = new TreeNode(pre[i]).

If the top of the stack, that is the most recently node left is null, then its left is current node, otherwise right.

If we meet the same value in pre and post, we complete current subtree, we pop top in stack.