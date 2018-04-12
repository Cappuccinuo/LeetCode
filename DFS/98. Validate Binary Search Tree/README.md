Time spent : 10 min(See hint)

Solution : Inorder Traversal

GIVEN: a binary tree

RETURNS: if it is a valid binary search tree

**Example 1:**

```
    2
   / \
  1   3
```

Binary tree 

```
[2,1,3]
```

, return true.

**Example 2:**

```
    1
   / \
  2   3
```

Binary tree 

```
[1,2,3]
```

, return false.



Use inorder traversal to judge if the order is valid. Keep a global prev val, and init flag.