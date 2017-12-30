Time spent : 15 min (See hint)

EXAMPLES:

Input: 

```
     4
   /   \
  2     7
 / \   / \
1   3 6   9
```

Output: 

​     4
   /   \
  7     2
 / \   / \
9   6 3   1



1. Use Recursion.  Actually like a bottom-up solution.

2. Use Iterative with Queue. Swap the left and right node.

3. ​     4
      /   \
     2     7
    / \   / \
   1   3 6   9

   =>

   ​     4
      /   \
     2     7
    / \   / \
   3   1 9   6
   =>

   ​     4
      /   \
     7     2
    / \   / \
   9   6 3   1