Time spent : 15min (see hint)

GIVEN: a binary tree

RETURNS: the largest value in each row

**Example:**

```
Input: 

          1
         / \
        3   2
       / \   \  
      5   3   9 

Output: [1, 3, 9]
```



DFS

We need to know the depth of each row. Corresponding to the final list of result index.