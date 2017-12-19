Time spent : 20 min(See hint)

GIVEN: a TreeNode

RETURNS: maximum sum, which cannot add adjacent integer

Note: the array is a circle

EXAMPLES:

Input: 

```
     3
    / \
   2   3
    \   \ 
     3   1
```

Output:  3 + 3 + 1 = **7**.

Input: 

```
     3
    / \
   4   5
  / \   \ 
 1   3   1
```

Output:   4 + 5 = **9**



Solution 1 : DFS

Two methods, robInclude, robExclude. We need to find the max one from robInclude(root), robExclude(root)

when robInclude, the result is robExclude(root.left) + robExclude(root.right) + root.val

when robexclude, the result is rob(root.left) + rob(root.right)



Solution 2 : DP (optimal substructure + overlapping of subproblems)

We use a hashmap to keep the memory. Key is the TreeNode, value is the max value if we rob that house.