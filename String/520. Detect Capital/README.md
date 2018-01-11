Time spent : 10 min(self)

GIVEN: a String 

RETURNS: true iff the usage of capitals in the string is right

Note: 

We define the usage of capitals in a word to be right when one of the following cases holds:

1. All letters in this word are capitals, like "USA".
2. All letters in this word are not capitals, like "leetcode".
3. Only the first letter in this word is capital if it has more than one letter, like "Google".

EXAMPLES:

```
Input: "USA"
Output: True
```

```
Input: "FlaG"
Output: False
```



Go through the word, if the character is A-Z, count++.

If count == 0, that means all chars is lowercase, return true.

If count == s.length(), that means all chars is uppercase, return true.

If count == 1 and s.charAt(0) is in A-Z, that means the first letter is the only uppercase one, return true.

Otherwise return false.