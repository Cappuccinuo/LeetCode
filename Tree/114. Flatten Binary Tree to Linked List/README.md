Time spent : 15 min

GIVEN: a binary tree

EFFECTS: flatten it to a linked list in-place

EXAMPLES:

Input: 

```
    1
   / \
  2   5
 / \   \
3   4   6
```

Output: 

```
1
 \
  2
   \
    3
     \
      4
       \
        5
         \
          6
```



Solution: 

We can find that, all we need to do is set left child to null, and make left child to root's right, and root's right to the end of new right child. 