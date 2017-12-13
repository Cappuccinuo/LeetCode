Time spent : 15 min(self)

GIVEN: a TreeNode and a target

RETURNS: true if there exist two elements in the BST such that their sum is equal to the given target.

EXAMPLES:

Input: 

```
    5
   / \
  3   6
 / \   \
2   4   7

Target = 9
```

Output: True

Input:

```
Input: 
    5
   / \
  3   6
 / \   \
2   4   7

Target = 28
```

Output: False



1. if the set contains (k - queue.remove().val), return true
2. Otherwise add queue.remove() 's va; to hashset, add node.left + node.right to queue.