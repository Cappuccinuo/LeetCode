Time spent :  15 min(See hint)

GIVEN: a BST and a key

RETURNS: delete the node with key value

EXAMPLES:

**Example:**

```
root = [5,3,6,2,4,null,7]
key = 3

    5
   / \
  3   6
 / \   \
2   4   7

Given key to delete is 3. So we find the node with value 3 and delete it.

One valid answer is [5,4,6,2,null,null,7], shown in the following BST.

    5
   / \
  4   6
 /     \
2       7

Another valid answer is [5,2,6,null,4,null,7].

    5
   / \
  2   6
   \   \
    4   7
```

Algorithm:

If root is null, return null.

If root.val > key, then we delete the node in left subtree.

If root.val < key, then we delete the node in right subtree.

If they are equal, we find the node with minimum val in root.right. Then exchange the value, keep delete the node in right subtree.