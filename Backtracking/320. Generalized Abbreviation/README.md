Time spent :  10 min(See hint)

GIVEN: a string

RETURNS: abbreviations of the word

EXAMPLES:

```
Input: "word"
Output:
["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", "w1r1", "1o2", "2r1", "3d", "w3", "4"]
```

Algorithm:

// not abbreviate the character

DFS(word, current + (count == 0 ? "" : count) + word.charAt(index), 0, index + 1, result);

// abbreviate

DFS(word, current, count + 1, index + 1, result);