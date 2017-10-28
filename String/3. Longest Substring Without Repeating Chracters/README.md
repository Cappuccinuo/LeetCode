Time spent : 20 min

Solution : String -> Integer	

GIVEN: a String

RETURNS: the length of the longest substring without repeating characters.

EXAMPLES:

Input: 

```
"abcabcbb"
```

Output: 3 ("abc")

Input: 

```
"pwwkew"
```

Output: 3 ("wke")

Input: 

```
"bbbbb"
```

Output: 1 ("b")

DESIGN STRATEGY: HashMap + Two pointers



1. Build a HashMap<Character, Integer>, store the index of corresponding character.
2. Use two pointers, j iterates the string, and put every character at j into hash map. When the hashmap has the character at j, move i to the position of (previous character pos + 1), but if this position is smaller than current i pos, keep the i pos. That is, Math.max(i, map.get(s.charAt(j) + 1))
3. The len is j - i + 1 each time. Get the max one.
