Time spent :  10 min(Self)

GIVEN: a string containing only digits

RETURNS: all possible valid ip addresses

EXAMPLES:

```
Input: "25525511135"
Output: ["255.255.11.135", "255.255.111.35"]
```

Algorithm:

Termination requirement:

current.size > 4

current.size == 4 && index == s.length()

valid ip requirement:

0 < ip.length() < 4

cannot start with 0 and length() > 1

val >= 0 and < 256