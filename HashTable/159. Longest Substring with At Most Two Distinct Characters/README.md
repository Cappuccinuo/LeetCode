Time spent : 10 min(self)

Solution : String -> Integer	

GIVEN: a String

RETURNS: the length of the longest substring with 2 distinct characters.

EXAMPLES:

Input: 

```
“eceba”
```

Output: 3 ("ece")

DESIGN STRATEGY: HashMap + Two pointers



1. Use a sliding window. Every time put the right side character in the hashmap. If after put the character, map.get(c) == 1, that means it is a new character, count++.
2. while (count > 2), we need to move the left side. Every time we make the map.get(c) - 1. When map.get(c) == 0, that means one of the distinct character is out, we can repeate the process.

