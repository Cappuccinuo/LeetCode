Time spent : 20 min

Solution : Self evident	

GIVEN: a String 

RETURNS: all possible states of the string after one valid move

Note: only flip consecutive "++" to "--"

EXAMPLES:

Input: 

```
s = "++++"
```

Output: 

```
[
  "--++",
  "+--+",
  "++--"
]
```



DESIGN STRATEGY: 

1. traverse the string, if the character at i and i+1 are both '+', then flip them.
2. we can use substring instead of charAt to connect all the string part