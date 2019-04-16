Time spent : 40 min(see hint)

GIVEN: a non-empty string

RETURNS: true iff it can be constructed by taking a substring of it and appending multiple copies of the substring together

EXAMPLES:

```
Input: "abab"

Output: True

Explanation: It's the substring "ab" twice.
```

```
Input: "aba"

Output: False
```

```
Input: "abcabcabcabc"

Output: True

Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
```



Try all the possible substring of the given string. Just need to test the max to len / 2.

