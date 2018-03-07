Time spent : 10 min (self)

GIVEN: a TreeNode

RETURNS: second minimum value

Note: each node in this tree has non-negative value, and has exactly two or zero sub-node. 

**Example 1:**

```
Input: 
    2
   / \
  2   5
     / \
    5   7

Output: 5
Explanation: The smallest value is 2, the second smallest value is 5.

```

**Example 2:**

```
Input: 
    2
   / \
  2   2

Output: -1
Explanation: The smallest value is 2, but there isn't any second smallest value.
```

Solution : BFS (Use the idea of level order traversal)

Use a boolean isFind to record if there is a more larger number than root, if there is, then the second smallest number must exist. Just need to pick the min one every time we come across a larger num than root.val.