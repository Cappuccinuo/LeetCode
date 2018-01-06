Time spent : 10 min(Self)



GIVEN: a Integer numRows

RETURNS: the first numRows of Pascal's triangle



EXAMPLES:

Input: 

```
5
```

Output: 

```
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
```



DESIGN STRATEGY: 

Use dynamic programming.

For a specific place x[i][j] = x[i - 1][j] + x[i - 1][j - 1]