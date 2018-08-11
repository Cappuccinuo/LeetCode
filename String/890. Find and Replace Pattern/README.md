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

Traverse all the words. Using two map to check each word.