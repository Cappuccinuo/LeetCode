Time spent : 20 min(self)

GIVEN: a string s

RETURNS: the longest palindromic subsequence's length in s

**Example 1:**
Input:

```
"bbbab"

```

Output:

```
4

```

One possible longest palindromic subsequence is "bbbb".

**Example 2:**
Input:

```
"cbbd"

```

Output:

```
2

```

One possible longest palindromic subsequence is "bb".



The optimal structure:

dp\[i][j]: the longest palindromic subsequence's length of substring(i, j)

if s.charAt(i) == s.charAt(j), dp\[i][j] = dp\[i + 1][j - 1] + 2

Else dp\[i][j] = max(dp\[i][j - 1], dp\[i + 1][j])