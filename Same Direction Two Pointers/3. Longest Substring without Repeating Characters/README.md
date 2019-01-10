Time spent : 10  min(Self)

GIVEN: a string

RETURNS: the length of the longest substring without repeating characters

EXAMPLES:

**Example 1:**

```
Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
```

**Example 2:**

```
Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
```

**Example 3:**

```
Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
```

Algorithm:

Using same direction two pointers.

We let end pointer continue to move, and keep a map to keep record of letter frequency. If current letter frequency is larger than 1, that means it has repeated, then we move start pointer until map[letter] == 1.