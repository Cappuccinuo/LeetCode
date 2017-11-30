Time spent : 15 min

GIVEN: a TreeNode

RETURNS: all root-to-leaf paths as a list

EXAMPLES:

Input: 

```
   1
 /   \
2     3
 \
  5
```

Output: ["1->2->5", "1->3"]

Same pattern for most of DFS. Orignal assign root, "", list to searchBT

public void searchBT(TreeNode root, String path, List<String> result)

1. if root.left and root.right both are null, add path + root.val to result
2. if root.left != null, searchBT(root.left, path + root.val + *"->"*, result)
3. same thing happens to root.right != null