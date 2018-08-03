Time spent :  10 min(See hint)

GIVEN: a list of query words

RETURNS: the number of words that are stretchy

EXAMPLES:

```
Example:
Input: 
S = "heeellooo"
words = ["hello", "hi", "helo"]
Output: 1
Explanation: 
We can extend "e" and "o" in the word "hello" to get "heeellooo".
We can't extend "helo" to get "heeellooo" because the group "ll" is not extended.
```

Algorithm:

Loop through all words. `check(string S, string W)` checks if `W` is stretchy to `S`.

In `check` function, use two pointer:

1. If `S[i] == W[j`, `i++, j++`
2. If `S[i - 2] == S[i - 1] == S[i]` or `S[i - 1] == S[i] == S[i + 1]`, `i++`
3. return false