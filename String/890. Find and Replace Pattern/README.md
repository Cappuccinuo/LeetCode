Time spent :  15 min(Self)

GIVEN: a list of words and a pattern

RETURNS: a list of the words in words that match the given pattern

EXAMPLES:

**Example 1:**

```
Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
Output: ["mee","aqq"]
Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}. 
"ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation,
since a and b map to the same letter.
```

Algorithm:

Traverse each word in words, see if the word can be formed in pattern.

1. If w and p not same length, return false

2. map<character, character>    

   if (map.containsKey(c) && map.get(c) != word.charAt(i))

   if (map.containsValue(word.charAt(i)) && !map.containsKey(c))

   this two situation will return false