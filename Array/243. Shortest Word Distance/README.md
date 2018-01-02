Time spent : 10 min(See hint)

GIVEN: a list of words and two words word1 and word2

RETURNS: the shortest distance between two words in the list

EXAMPLES:

```
Assume that words = ["practice", "makes", "perfect", "coding", "makes"].

Given word1 = “coding”, word2 = “practice”, return 3.
Given word1 = "makes", word2 = "coding", return 1.
```



Keeping two indices where we store the most recent locations of word1 and word2.

Each time we find a new occurance of one of the words, we do not need to search the entire array for the other word.