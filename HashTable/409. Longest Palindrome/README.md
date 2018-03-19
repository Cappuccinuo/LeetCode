Time spent : 13 min(self)

GIVEN: a string

RETURNS: the length of longest palindrome can be built with the string letters

**Example:**

```
Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
```

1. Use hashmap to store the letter frequency.
2. Several cases: cccxxx, ccxx, cccxx, c
3. If the character has even frequency, we can add it directly to the final palindrome string.
4. We can always put the (if any)odd one's extra character to the final string.
