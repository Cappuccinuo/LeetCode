Time spent : 45 min(During contest)

GIVEN: Two integers A and B

RETURNS: Return any string S such that

Note:

- `S` has length `A + B` and contains exactly `A` `'a'` letters, and exactly `B` `'b'` letters;
- The substring `'aaa'` does not occur in `S`;
- The substring `'bbb'` does not occur in `S`.

EXAMPLES:

**Example 1:**

```
Input: A = 1, B = 2
Output: "abb"
Explanation: "abb", "bab" and "bba" are all correct answers.
```

**Example 2:**

```
Input: A = 4, B = 1
Output: "aabaa"
```

Algorithm:

Write the most common letter first. The only time we don't write the most common letter is if the last two letters we have written are also the most common letter.