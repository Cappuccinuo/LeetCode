Time spent : 15 min(see hint)

GIVEN: a string array

RETURNS: the longest common prefix string amongst the given array

EXAMPLES:

Input: 

```
"abc" "ab" "a"
```

Output: "a"



1. Use String.indexOf(str) to find if str2 has the same subsequence. "abc".indexOf("ab") = 0, "ab".indexOf("abc") = -1
2. If str[i].indexOf(prefix) != 0, prefix = prefix.substring(0, prefix.length() - 1)
