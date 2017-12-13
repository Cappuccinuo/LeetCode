Time spent : 10 min(See other's thought)

Solution : HashMap	

Given : Four lists A, B, C, D of integer values

RETURNS: how many tuples (i, j, k, l) there are such that A[i] + B[j] + C[k] + D[l] is zero.

EXAMPLES:

```
Input:
A = [ 1, 2]
B = [-2,-1]
C = [-1, 2]
D = [ 0, 2]

Output:
2

Explanation:
The two tuples are:
1. (0, 0, 0, 1) -> A[0] + B[0] + C[0] + D[1] = 1 + (-2) + (-1) + 2 = 0
2. (1, 1, 0, 0) -> A[1] + B[1] + C[0] + D[0] = 2 + (-1) + (-1) + 0 = 0
```

DESIGN STRATEGY: HashMap



1. First put all the corresponding sum in A and B in the hashmap.
2. Then go through C and D, count += map.getOrDefault(0 - C[i] - D[j], 0).