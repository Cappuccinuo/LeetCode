Time spent : 5 min

Solution : Array -> Tree	

GIVEN: a integer array where elements are sorted in ascending order

RETURNS: its height balanced BST

EXAMPLES:

Input: 

```
[1,2,3,4,5,6,7]
```

Output: [4,2,6,1,3,5,7]

DESIGN STRATEGY: Iteration



1. helper function treeBuild, input the array, left and right.
2. if left exceed right, return null
3. middle is the half of left and right sum. Assign the middle one as the root.
4. left is from left, to middle -1, right is from middle+1 to right
