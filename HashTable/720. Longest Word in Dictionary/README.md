Time spent : 45 min(self)

Solution : HashSet	

GIVEN: a list of strings words

RETURNS: longest word in words that can be built one character at a time by other words in words

EXAMPLES:

```
Input: 
words = ["w","wo","wor","worl", "world"]
Output: "world"
Explanation: 
The word "world" can be built one character at a time by "w", "wo", "wor", and "worl".`
```

```
Input: 
words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
Output: "apple"
Explanation: 
Both "apply" and "apple" can be built from other words in the dictionary. However, "apple" is lexicographically smaller than "apply".
```



Sort the array first in length ascending order. If the length are the same, sort in lexicographically decending order.

Put all the word in words in a hashset.

Go through the longest word in words, see if its substrings exists in the hashset.