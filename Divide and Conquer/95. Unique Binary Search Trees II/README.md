Time spent : 30 min (See hint)

GIVEN: Given an integer n

RETURNS: all structurally unique BST's that store values 1…n

**Example:**

```
Input: 3
Output:
[
  [1,null,3,2],
  [3,2,null,1],
  [3,1,null,null,2],
  [2,1,3],
  [1,null,2,null,3]
]
Explanation:
The above output corresponds to the 5 unique BST's shown below:

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
```



Use the idea of Divide and Conquer, for every value from 1 to n, we can have the left list and right list. The root is the current value, and root.left can be every node in left list, same as right list. 

