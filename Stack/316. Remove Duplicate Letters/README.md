Time spent :  20 min(See hint)

GIVEN: Given a string which contains only lowercase letters

RETURNS: remove duplicate letters so that every letter appear once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.

**Example 1:**

```
Input: "bcabc"
Output: "abc"
```

**Example 2:**

```
Input: "cbacdcbc"
Output: "acdb"
```

Algorithm:

Monotonous Stack.

To keep the order, we need to keep the stack in lexicographical increasing order(If the frequency of stack peek is larger than 0).

Every time we decrease the letter's frequency, and maintain a visited set. If the letter has been in the stack, we continue. Otherwise we compare current letter with stack peek. If the stack peek's frequency is larger than 0, that means it can be omitted, so we pop it, and remove it from visited set.

