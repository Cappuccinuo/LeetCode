Time spent : 10 min(See hint)

GIVEN: Given the `root` of a binary tree, consider all *root to leaf paths*: paths from the root to any leaf.  A `node` is *insufficient* if **every** such root to leaf path intersecting this `node` has sum strictly less than `limit`.

RETURNS: Delete all insufficient nodes simultaneously, and return the root of the resulting binary tree.

EXAMPLES:

**Example 1:**

```
Input: root = [1,2,3,4,-99,-99,7,8,9,-99,-99,12,13,-99,14], limit = 1

Output: [1,2,3,4,null,null,7,8,9,null,14]
```

**Example 2:**

```
Input: root = [5,4,8,11,null,17,4,7,1,null,null,5,3], limit = 22

Output: [5,4,8,11,null,17,4,7,null,null,null,5]
```

 

**Example 3:**

```
Input: root = [1,2,-3,-5,null,4,null], limit = -1

Output: [1,null,-3,4]
```

Algorithm:

Delete root.val from limit every traverse, check every leaf of the tree, if the root.val is smaller than limit, then return null, otherwise return the node. If at last, the root.left and root.right is the same, then return null.