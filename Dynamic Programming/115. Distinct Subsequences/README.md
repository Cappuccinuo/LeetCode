Time spent :  10 min(Self)

GIVEN: a string S and a string T

RETURNS: the number of distinct subsequences of S which equals T

EXAMPLES:

**Example 1:**

```
Input: S = "rabbbit", T = "rabbit"
Output: 3
Explanation:

As shown below, there are 3 ways you can generate "rabbit" from S.
(The caret symbol ^ means the chosen letters)

rabbbit
^^^^ ^^
rabbbit
^^ ^^^^
rabbbit
^^^ ^^^
```

**Example 2:**

```
Input: S = "babgbag", T = "bag"
Output: 5
Explanation:

As shown below, there are 5 ways you can generate "bag" from S.
(The caret symbol ^ means the chosen letters)

babgbag
^^ ^
babgbag
^^    ^
babgbag
^    ^^
babgbag
  ^  ^^
babgbag
    ^^^
```

Algorithm:

确定状态

Focus on the last element we pick, for rabbbit and rabbit, if for last t, we found both the last one of each string, then all we need to know, is if rabbbi and rabbi form the other part from t.

dp\[i][j] represent using previous i character of s, form previous j character of t, how many subsequence can we form.

dp\[i][j] = 1 + dp\[i - 1][j - 1] (if s[i] == t[j])

初始条件

If t's length is 0, then we whatever how many we use in S, the answer is 1. So dp\[i][0] are all 1.

结果

dp\[m][n]