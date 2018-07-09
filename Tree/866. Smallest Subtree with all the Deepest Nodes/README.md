Time spent :  20 min(see hint)

GIVEN: a binary tree rooted at root

RETURNS: the node with the largest depth such that it contains all the deepest nodes in its subtree

**Example 1:**

```
Input: [3,5,1,6,2,0,8,null,null,7,4]
Output: [2,7,4]
Explanation:
We return the node with value 2, colored in yellow in the diagram.
The nodes colored in blue are the deepest nodes of the tree.
The input "[3, 5, 1, 6, 2, 0, 8, null, null, 7, 4]" is a serialization of the given tree.
The output "[2, 7, 4]" is a serialization of the subtree rooted at the node with value 2.
Both the input and output have TreeNode type.
```

Algorithm:

Using a map to record the node and its depth that contains deepest node.

If the node is a leaf, just put node, depth in map and return node.

If the node.left is null, dfs its right node. Same as node.right is null.

Get the left most node by dfs(root.left, map, depth + 1), same as right most node.

Compare the value of map.get(left), map.get(right).

If the value is the same, just put root, map.get(left) in map.

Otherwise return the node with larger map value.