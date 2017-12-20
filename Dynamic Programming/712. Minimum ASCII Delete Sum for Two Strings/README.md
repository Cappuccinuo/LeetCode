Time spent : 70 min(See Solution)

GIVEN: two strings s1, s2

RETURNS: the lowest ASCII sum of deleted characters to make two strings equal

EXAMPLES:

```
Input: s1 = "sea", s2 = "eat"
Output: 231
Explanation: Deleting "s" from "sea" adds the ASCII value of "s" (115) to the sum.
Deleting "t" from "eat" adds 116 to the sum.
At the end, both strings are equal, and 115 + 116 = 231 is the minimum sum possible to achieve this.

Input: s1 = "delete", s2 = "leet"
Output: 403
Explanation: Deleting "dee" from "delete" to turn the string into "let",
adds 100[d]+101[e]+101[e] to the sum.  Deleting "e" from "leet" adds 101[e] to the sum.
At the end, both strings are equal to "let", and the answer is 100+101+101+101 = 403.
If instead we turned both strings into "lee" or "eet", we would get answers of 433 or 417, which are higher.
```

Design strategy: Dynamic Programming

Bottom-up dynamic programming.

Let dp[i][j] be the answer to the problem for the strings s1[i:], s2[j:]

When one of the input strings is empty, the answer is the ASCII-sum of the other string. We can calculate this cumulatively using code like `dp[i][s2.length()] = dp[i+1][s2.length()] + s1.codePointAt(i)`.

In my code I use Integer.valueOf(char c)

When `s1[i] == s2[j]`, we have `dp[i][j] = dp[i+1][j+1]` as we can ignore these two characters.

When `s1[i] != s2[j]`, we will have to delete at least one of them. We'll have `dp[i][j]` as the minimum of the answers after both deletion options.

dp\[i][j] = Math.min(dp\[i + 1][j] + Integer.valueOf(s1.charAt(i))), dp\[i][j + 1] + Integer.valueOf(s2.charAt(j)))



sea

eat

dp\[1][0] = dp\[2][1] = dp\[3][2] = t's ascii value

dp\[0][0] = Math.min(delete s, delete e) => Math.min(dp\[0][1] + Integer.valueOf(s), dp\[1][0] + Integer.valueOf(e))

