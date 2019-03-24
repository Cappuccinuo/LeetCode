Time spent : 10 min(See hint)

GIVEN: Given a binary tree where all the right nodes are either leaf nodes with a sibling (a left node that shares the same parent node) or empty

RETURNS: flip it upside down and turn it into a tree where the original right nodes turned into left leaf nodes. Return the new root.

**Example:**

```
Input: [1,2,3,4,5]

    1
   / \
  2   3
 / \
4   5

Output: return the root of the binary tree [4,5,2,#,#,3,1]

   4
  / \
 5   2
    / \
   3   1  
```

Algorithm:

We can find that the leftmost leaf node is the newRoot.

So we first find that node by calling

```java
TreeNode newRoot = upsideDownBinaryTree(root.left);
```

For the example, newRoot is 4, currently the root is 2.

We want 4's left child be 5, and 4's right child be 2. So,

```java
root.left.left = root.right;
root.left.right = root;
```

Don't forget to set 2's right and left child be null.