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

1. We can find the pattern that the first half substring and second half substring of "abab" are equal, and three parts of "ababab" are equal, and five parts of "abcabcabcabcabc" are equal. So we just need to compare prime number parts of substring.

