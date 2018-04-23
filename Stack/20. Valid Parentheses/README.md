Time spent : 10 min(Self)

Solution : Stack

GIVEN: a string containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`

RETURNS: determine if the input string is valid.

**Example 1:**

```
Input: "()"
Output: true
```

**Example 2:**

```
Input: "()[]{}"
Output: true
```

**Example 3:**

```
Input: "(]"
Output: false
```

**Example 4:**

```
Input: "([)]"
Output: false
```

**Example 5:**

```
Input: "{[]}"
Output: true
```



First error here is just compare top with current letter, the relationship is not equal. Just use stack, and compare current letter with the stack top letter.