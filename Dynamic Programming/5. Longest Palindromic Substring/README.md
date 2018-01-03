Time spent : 20 min(see hint)

GIVEN: a string s

RETURNS: longest palindromic substring in s

EXAMPLES:

```
Input: "babad"

Output: "bab"

Note: "aba" is also a valid answer.
```

```
Input: "cbbd"

Output: "bb"
```



1. We can use DP to solve the problem. Use an two-D array to represent if string from index i to index j is palindrome.
2. Use a bottom-up dp, once two char is equal, and their index is 0 or 1 or 2, or dp\[i + 1][j - 1] is palindrome, then dp\[i][j] is true.
3. Compare the substring length with current result, if length is larger, replace current result.

