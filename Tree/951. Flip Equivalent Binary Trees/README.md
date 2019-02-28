Time spent :  5 min(Self)

GIVEN: a binary tree T, we can define a flip operation as follows: choose any node, and swap the left and right child subtrees.

RETURNS: determines whether two binary trees are *flip equivalent*.  The trees are given by root nodes `root1` and `root2`.

EXAMPLES:

**Example 1:**

```
Input: root1 = [1,2,3,4,5,6,null,null,null,7,8], root2 = [1,3,2,null,6,4,5,null,null,null,null,8,7]
Output: true
Explanation: We flipped at nodes with values 1, 3, and 5.

```

![pic](https://assets.leetcode.com/uploads/2018/11/29/tree_ex.png)

Algorithm:

If root1's val is not equal to root2's val, we return false.

If both are null, we return true.

If one is null, the other is not, we return false.

Then we compare 

```java
(flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right)) 
|| 
(flipEquiv(root1.right, root2.left) && flipEquiv(root1.left, root2.right))
```

