

Time spent : 20 min

GIVEN: an integer n

RETURNS: number of structurally unique BST's that store values 1…n

EXAMPLES:

Input: 

```
3
```

Output: 

```
   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
```

Design strategy: Dynamic Programming

```
Taking 1~n as root respectively:
1 as root: # of trees = F(0) * F(n-1)  // F(0) == 1
2 as root: # of trees = F(1) * F(n-2) 
3 as root: # of trees = F(2) * F(n-3)
...
n-1 as root: # of trees = F(n-2) * F(1)
n as root:   # of trees = F(n-1) * F(0)

So, the formulation is:
F(n) = F(0) * F(n-1) + F(1) * F(n-2) + F(2) * F(n-3) + ... + F(n-2) * F(1) + F(n-1) * F(0)
```

dp[0] = 1

dp[1] = 1

for (int i = 2; i <= n; i++) {

​	for (int j = 1; j <= i; j++) {

​		dp[i] += dp[j - 1] * dp[i - j]}}