Time spent : 15 min(See hint)

GIVEN: a list of words and two words word1 and word2

RETURNS: the shortest distance between two words in the list

EXAMPLES:

```
Assume that words = ["practice", "makes", "perfect", "coding", "makes"].

Given word1 = “coding”, word2 = “practice”, return 3.
Given word1 = "makes", word2 = "coding", return 1.
```

Use a HashMap. The key is the word (String), the value is the index list of the word(List<Integer>)

When get the minDistance, we don't need to do double loop. Just keep i and j < wordList.size(), if index1 < index2, i++, otherwise j—.