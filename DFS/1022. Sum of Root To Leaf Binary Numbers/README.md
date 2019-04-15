Time spent :  5 min(Self)

GIVEN: Given a binary tree, each node has value `0` or `1`. 

RETURNS: For all leaves in the tree, consider the numbers represented by the path from the root to that leaf.

Return the sum of these numbers.

EXAMPLES:

**Example 1:**

![img](https://assets.leetcode.com/uploads/2019/04/04/sum-of-root-to-leaf-binary-numbers.png)

```
Input: [1,0,1,0,1,0,1]
Output: 22
Explanation: (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
```

Algorithm:

DFS recursively calculate the current sum. 