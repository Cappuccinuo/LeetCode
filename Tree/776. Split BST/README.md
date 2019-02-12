Time spent :  15 min(See hint)

GIVEN: a BST and a value

RETURNS: the bst after splitting by value

**Example 1:**

```
Input: root = [4,2,6,1,3,5,7], V = 2
Output: [[2,1],[4,3,6,null,null,5,7]]
Explanation:
Note that root, output[0], and output[1] are TreeNode objects, not arrays.

The given tree [4,2,6,1,3,5,7] is represented by the following diagram:

          4
        /   \
      2      6
     / \    / \
    1   3  5   7

while the diagrams for the outputs are:

          4
        /   \
      3      6      and    2
            / \           /
           5   7         1
```

Algorithm:

For a tree like

​            100
​         /         \
​     18          180
​    / \          /     \
   5   60    150   200

If we already know the split of root.left, and root.right. left[] and right[].

a. If root's val is smaller or equal to V, then we know that the left subtree must be split to one part, together with no or some nodes in root.right. 

b. Similarly, if root's val is larger than V, then we know that the right subtree must be split to one part, together with no or some nodes in root.left.

So for  a, we put left subtree to left[0]. For b, we put right subtree to right[1].

For V = 160. root = 100. we can see that left[0] is the while subtree, left[1] is null. And right[0] is 150, right[1] is 180 and 200. So this time, root.right that is 100.right will be right[0]. The final result is root, right[1].