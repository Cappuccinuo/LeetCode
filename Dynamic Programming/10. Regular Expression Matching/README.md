Time spent :  20 min(Self)

GIVEN: Given an input string (`s`) and a pattern (`p`), implement regular expression matching with support for `'.'` and `'*'`.

```
'.' Matches any single character.
'*' Matches zero or more of the preceding element.
```

RETURNS: true or false

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
p = "a*"
Output: true
Explanation: '*' means zero or more of the precedeng element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
```

**Example 3:**

```
Input:
s = "ab"
p = ".*"
Output: true
Explanation: ".*" means "zero or more (*) of any character (.)".
```

**Example 4:**

```
Input:
s = "aab"
p = "c*a*b"
Output: true
Explanation: c can be repeated 0 times, a can be repeated 1 time. Therefore it matches "aab".
```

**Example 5:**

```
Input:
s = "mississippi"
p = "mis*is*p*."
Output: false
```

Algorithm:

Using dynamic programming.

For s and p, what should we focus on?

For s, it must be the current character.

For p, it should be the current character, and the next character. Cause we need to deal with the situation like a* or .*.

If pSecond is not *, the situation is easy: 

if sFirst == pFirst, the result is helper(s, sIndex + 1, p, pIndex + 1)

Else if pSecond is *, there are two situation:

if sFirst != pFirst, we choose to matching 0 for *. the result is helper(s, sIndex, p, pIndex + 2)

if sFirst == pFirst, we have two choice, match s, so the result is helper(s, sIndex + 1, p, pIndex)

or we match sFirst as 0, so the result is helper(s, sIndex, p, pIndex + 2). The latter deal with the situation s = a, p = a*a