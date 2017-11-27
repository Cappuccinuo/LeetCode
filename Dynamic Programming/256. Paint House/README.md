Time spent : 20 min

Solution : 2D Array -> Integer

GIVEN: a `n * 3` cost matrix

RETURNS: min cost

EXAMPLES:

Input: 

```
[[2,3,4], [2,100,150]]
```

Output: 5

Design strategy: Dynamic Programming



1. Focus on the current house, if current is red, then costs\[i][0] = former one min(blue, green)
2. Change the matrix to represent the cost so far.
