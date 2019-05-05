Time spent : 10 min(See hint)

GIVEN: Given the `root` of a binary tree with `N` nodes, each `node` in the tree has `node.val` coins, and there are `N` coins total.

RETURNS: Return the number of moves required to make every node have exactly one coin.

EXAMPLES:

**Example 1:**

**![img](https://assets.leetcode.com/uploads/2019/01/18/tree1.png)**

```
Input: [3,0,0]
Output: 2
Explanation: From the root of the tree, we move one coin to its left child, and one coin to its right child.
```

**Example 2:**

**![img](https://assets.leetcode.com/uploads/2019/01/18/tree2.png)**

```
Input: [0,3,0]
Output: 3
Explanation: From the left child of the root, we move two coins to the root [taking two moves].  Then, we move one coin from the root of the tree to the right child.
```

**Example 3:**

**![img](https://assets.leetcode.com/uploads/2019/01/18/tree3.png)**

```
Input: [1,0,2]
Output: 2
```

**Example 4:**

**![img](https://assets.leetcode.com/uploads/2019/01/18/tree4.png)**

```
Input: [1,0,0,null,3]
Output: 4
```

Algorithm:

For a given node, what's the number of coins it needs to give or require?

If the root.val is 3, left is 0, right is 0, it need give 2.

If the root.val is 0, left is 2, right is 0, it need require 1.

So what the root need is root.val + left + right - 1.

Here left and right is the recuision value of left subtree and right subtree.

The final move is every time we add left and right's absolute value together.