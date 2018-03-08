Time spent : 10 min (self)

GIVEN: a TreeNode

RETURNS: the tilt of the whole tree

Note: The tilt of a **tree node** is defined as the **absolute difference** between the sum of all left subtree node values and the sum of all right subtree node values. Null node has tilt 0.

**Example :**

```
Input: 
         1
       /   \
      2     3
Output: 1
Explanation: 
Tilt of node 2 : 0
Tilt of node 3 : 0
Tilt of node 1 : |2-3| = 1
Tilt of binary tree : 0 + 0 + 1 = 1

```

Same idea with LC543, LC124, use recursion

Keep a global variable to keep tilt. We need to use a method to calculate the sum of all nodes in a subtree. Update tilt in this method.