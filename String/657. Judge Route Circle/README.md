Time spent : 3 min

Solution : String -> Boolean	

GIVEN: a String of moves

RETURNS: true iff the robot moves back to the original place

EXAMPLES:

Input: 

```
"UD"
```

Output: true

Input: 

```
"LL"
```

Output: false

DESIGN STRATEGY: Transcribe formula



1. Assume "U" move add 1 to y, "D" move add -1 to y, so only when y = 0, the robot moves back to the original place.
2. str.toCharArray() turn a String into CharArray, so we can use for (char ch : moves.toCharArray)
