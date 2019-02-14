Time spent : 20 min(Self)

GIVEN:

A chess knight can move as indicated in the chess diagram below:

![img](https://assets.leetcode.com/uploads/2018/10/12/knight.png) .           ![img](https://assets.leetcode.com/uploads/2018/10/30/keypad.png)

 

This time, we place our chess knight on any numbered key of a phone pad (indicated above), and the knight makes `N-1` hops.  Each hop must be from one key to another numbered key.

Each time it lands on a key (including the initial placement of the knight), it presses the number of that key, pressing `N` digits total.

RETURNS: How many distinct numbers can you dial in this manner? Since the answer may be large, **output the answer modulo 10^9 + 7**.

EXAMPLES:

**Example 1:**

```
Input: 1
Output: 10
```

**Example 2:**

```
Input: 2
Output: 20
```

**Example 3:**

```
Input: 3
Output: 46
```

Algorithm:

Using dynamic programming. 

确定状态

If N = 2, then for each cell on board, it has certain pos to go, like for 3, it can go 4 and 8. What we want to know is the number of distinct way to dial from 4 and 8 for N = 1. So we can dial 4 and 8 after dial 3. We need to know the subproblem.

dp\[i][j]\[k] += dp\[l]\[m][k - 1], here l, m is the pos that i, j can go. To save space, we can just use dp and dp2, as the status only have connection with previous status.

初始条件

for N = 1, dp\[i][j] = 1.

结果

dp sum when k = N.