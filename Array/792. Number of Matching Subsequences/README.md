Time spent :  20 min(See hint)

GIVEN: string S and a dictionary of words

RETURNS: the number of words[i] that is a subsequence of S

```
Example :
Input: 
S = "abcde"
words = ["a", "bb", "acd", "ace"]
Output: 3
Explanation: There are three words in words that are a subsequence of S: "a", "acd", "ace".
```

Algorithm:

Put words into buckets by starting character. For words above

we have head[0] : "a", "acd", "ace", head[1] : "bb"

For each word, we create a class node, we have an index indicate the index of current node character, and the string word.

1st: 

"a", index = 1 == "a".length(), ans++

"acd", index = 1 != "acd".length(), add "acd" to head[c - '0']

"ace", index = 1 != "ace".length(), add "ace" to head[c - '0']

2nd:

"b", index = 1 != "bb".length(), add "bb" to head[b - '0']

3rd:

...