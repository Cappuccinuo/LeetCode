Time spent : 5 min	

GIVEN: two binary trees

RETURNS: true iff they are the same

EXAMPLES:

```
Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
```

```
Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
```

```
Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false
```



1. If p and q are both null, return true; If one of p and q is null, return false.
2. If p.val == q.val, do a recursion to judge p.left q.left and p.right q.right
3. else return false
