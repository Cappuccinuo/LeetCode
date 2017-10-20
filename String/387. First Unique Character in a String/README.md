Time spent : 5 min

Solution : String -> Integer	

GIVEN: a String 

RETURNS: the first non-repeating character in it and return its index. If it doesn't exist, return -1.

EXAMPLES:

Input: 

```
"leetcode"
```

Output: 0

Input: 

```
"loveleetcode"
```

Output: 2

DESIGN STRATEGY: Use HashMap to store the times of each character, then traverse the string, if the time is 1, return the index.
