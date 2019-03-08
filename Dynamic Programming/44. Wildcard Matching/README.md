Time spent :  20 min(Self)

GIVEN: an input string s and a pattern p.

RETURNS: wildcard pattern matching with support for `'?'` and `'*'`.

```
'?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).
```

EXAMPLES:

**Example 1:**

```
Input:
s = "aa"
p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".
```

**Example 2:**

```
Input:
s = "aa"
p = "*"
Output: true
Explanation: '*' matches any sequence.
```

**Example 3:**

```
Input:
s = "cb"
p = "?a"
Output: false
Explanation: '?' matches 'c', but the second letter is 'a', which does not match 'b'.
```

**Example 4:**

```
Input:
s = "adceb"
p = "*a*b"
Output: true
Explanation: The first '*' matches the empty sequence, while the second '*' matches the substring "dce".
```

**Example 5:**

```
Input:
s = "acdcb"
p = "a*c?b"
Output: false
```

Algorithm:

State: isPatternMatching for s.substring(0, i) and p.substring(0, j)

Function: 

if p[j] != '*'

dp\[i]\[j] |= (isEqual(s[i], p[j]) && dp\[i - 1][j - 1])                 

e.g    a    a      dp\[1][1] = dp\[0][0] = true

if p[j] == '*'

dp\[i][j] |= dp\[i - 1][j] || dp\[i][j - 1]

e.g     a     a*      dp\[1][2] = dp\[0][2]  * match a    || dp\[1][1]   * match empty

Init: dp\[0][0] = true.

Answer: dp\[slen][plen]