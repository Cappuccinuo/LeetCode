Time spent :  20 min(Self)

GIVEN: Given a 2D board and a list of words from the dictionary

RETURNS: find all words in the board.

EXAMPLES:

```
Input: 
board = [
  ['o','a','a','n'],
  ['e','t','a','e'],
  ['i','h','k','r'],
  ['i','f','l','v']
]
words = ["oath","pea","eat","rain"]

Output: ["eat","oath"]
```

Algorithm:

To search the words fast, we can put all the words in a trie tree, so that we can know if a word is in the words list.

1. For the result list, we need to use hashset to remove duplicates.
2. In DFS, when child.isWord, we should not return, as there might be more words, like aaa, aaab.
3. Mark the board visited with '#', after DFS we recover it to origin.