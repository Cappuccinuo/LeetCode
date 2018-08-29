Time spent :  15 min(See hint)

GIVEN: N represents N nodes

RETURNS: The final list of full binary tree in any order

EXAMPLES:

```
Input: 7
Output: [[0,0,0,null,null,0,0,null,null,0,0],[0,0,0,null,null,0,0,0,0],[0,0,0,0,0,0,0],[0,0,0,0,0,null,null,null,null,0,0],[0,0,0,0,0,null,null,0,0]]
```

![img](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/08/22/fivetrees.png)

Algorithm:

Recursively find the possible children of each node at each level. At each level subtract 1 from N since this node counts as a node. If N == 1 return a node with no children. For every i, get allPossibleFBT(i) and allPossibleFBT(N - i) for the remaining children on the opposite side.