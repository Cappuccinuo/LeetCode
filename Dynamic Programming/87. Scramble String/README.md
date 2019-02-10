Time spent :  15 min(See hint)

GIVEN: two string s1 and s2 of the same length

RETURNS: if s2 is a scrambled string of s1

Note: 

Below is one possible representation of *s1* = `"great"`:

```
    great
   /    \
  gr    eat
 / \    /  \
g   r  e   at
           / \
          a   t
```

To scramble the string, we may choose any non-leaf node and swap its two children.

For example, if we choose the node `"gr"` and swap its two children, it produces a scrambled string `"rgeat"`.

```
    rgeat
   /    \
  rg    eat
 / \    /  \
r   g  e   at
           / \
          a   t
```

We say that `"rgeat"` is a scrambled string of `"great"`.

Similarly, if we continue to swap the children of nodes `"eat"` and `"at"`, it produces a scrambled string `"rgtae"`.

```
    rgtae
   /    \
  rg    tae
 / \    /  \
r   g  ta  e
       / \
      t   a
```

We say that `"rgtae"` is a scrambled string of `"great"`.

EXAMPLES:

**Example 1:**

```
Input: s1 = "great", s2 = "rgeat"
Output: true
```

**Example 2:**

```
Input: s1 = "abcde", s2 = "caebd"
Output: false
```

Algorithm:

If T is scrambled from S, then S must be divided to two parts s1 and s2.

If T has two parts t1 and t2, two situation

1. t1 is scrambled from s1, t2 is scrambled from s2
2. t1 is scrambled from s2, t2 is scrambled from s1

确定状态

f\[i]\[j][k] represent if S can be scrambled from T

S1 is S's substring from i, len is k

T1 is T's substring from j, len is k

转移方程

f\[i]\[j][k] = OR(1 <= w <= k - 1){f\[i]\[j][w] AND f\[i + w]\[j + w][k - w]}      OR(1 <= w <= k - 1){f\[i]\[j + k - w][w] AND f\[i + w]\[j][k - w]}

初始条件和边界情况

If S[i] == T[j], then f\[i]\[j][1] = true, otherwise false.

计算顺序

k from small to large. Answer is f\[0]\[0][N]

Time Complexity: O(N^4)

Space Complexity: O(N^3)