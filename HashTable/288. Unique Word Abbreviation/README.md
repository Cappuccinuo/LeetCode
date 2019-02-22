Time spent : 15 min(See hint)

GIVEN: a dictionary. and following multiple word to check if it has unique abbreviation in the dictionary

RETURNS: true if the abbr is unique

**Example:**

```
Given dictionary = [ "deer", "door", "cake", "card" ]

isUnique("dear") -> false
isUnique("cart") -> true
isUnique("cane") -> false
isUnique("make") -> true
```

Algorithm:

So we will maintain a hashmap, key is abbr string, value is the string that it corresponding to.

First we traverse the dictionary, and get each word's abbreviation

If mapping does not contain the abbr, just mapping (abbr, word)

Otherwise we check if the mapping of abbr is current word, if not, set the mapping (abbr, "")

When we check if a word is unique, we get several cases:

The cases are as follows:

1. ["a", "a"]    isUnique("a")  => true
2. ["a"]           isUnique("a") => true
3. ["dig", "dog"]    isUnique("dig") => false
4. ["dig"]        isUnique("union") => true

For 4, if we don't have abbr in mapping, return true

For 1 and 2, the mapping is from (abbr, word), return true

Otherwise return 3.