Time spent : 15 min

GIVEN: a TreeNode, and a target key k

RETURNS: the value of the nearest leaf node to target k in the tree

**Example 1:**

```
Input:
root = [1, 3, 2], k = 1
Diagram of binary tree:
          1
         / \
        3   2

Output: 2 (or 3)

Explanation: Either 2 or 3 is the nearest leaf node to the target of 1.
```

**Example 2:**

```
Input:
root = [1], k = 1
Output: 1

Explanation: The nearest leaf node is the root node itself.
```

**Example 3:**

```
Input:
root = [1,2,3,4,null,null,null,5,null,6], k = 2
Diagram of binary tree:
             1
            / \
           2   3
          /
         4
        /
       5
      /
     6

Output: 3
Explanation: The leaf node with value 3 (and not the leaf node with value 6) is nearest to the node with value 2.
```



1. Use a depth-first search to record in our graph each edge travelled from parent to node
2. use a breath-first search on nodes that started with a value of k
