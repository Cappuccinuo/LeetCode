Time spent :  10 min(See hint)

GIVEN: a string

RETURNS: Return the lexicographically smallest subsequence of `text` that contains all the distinct characters of `text` exactly once.

EXAMPLES:

**Example 1:**

```
Input: "cdadabcc"
Output: "adbc"
```

**Example 2:**

```
Input: "abcd"
Output: "abcd"
```

**Example 3:**

```
Input: "ecbacba"
Output: "eacb"
```

**Example 4:**

```
Input: "leetcode"
Output: "letcod"
```

Algorithm:

1. Record the last position of each 26 character.
2. Loop on each character in the string. If the current character is smaller than stack peek, and the index of stack peek is not last, then pop the stack peek. 