Time spent :  5 min()

GIVEN: An arbitrary ransom note string and another string containing letters from all the magazines

RETURNS: True if the ransom note can be constructed from the magazines.

EXAMPLES:

**Note:**
Each letter in the magazine string can only be used once in your ransom note.

```
canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
```

Algorithm:

Using Hashmap or int[26] array.