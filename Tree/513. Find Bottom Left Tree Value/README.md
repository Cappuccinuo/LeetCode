Time spent : 10min (see hint to understand the problem)

GIVEN: a TreeNode

RETURNS: the leftmost value in the last row of the tree

**Example 1:**

```
Input:

    2
   / \
  1   3

Output:
1

```

**Example 2: **

```
Input:

        1
       / \
      2   3
     /   / \
    4   5   6
       /
      7

Output:
7
```



Keep two global variables, result and height, record the current leftmost value and the value's height.

If the height is less than the depth, that means current depth is deeper, then result is the first element we encounter, and the height become current depth. We traverse the tree from left to right. 