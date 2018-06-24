Time spent :  25 min(See hint)

GIVEN: two words beginWord and endWord, a dictionary's word list

RETURNS: all shortest transformation sequences from beginWord to endWord



**Example 1:**

```
Input:
beginWord = "hit",
endWord = "cog",
wordList = ["hot","dot","dog","lot","log","cog"]

Output:
[
  ["hit","hot","dot","dog","cog"],
  ["hit","hot","lot","log","cog"]
]
```

**Example 2:**

```
Input:
beginWord = "hit"
endWord = "cog"
wordList = ["hot","dot","dog","lot","log"]

Output: []

Explanation: The endWord "cog" is not in wordList, therefore no possible transformation.
```

Algorithm:

From start -> end, do bfs, get the neighbour map and distance map.

From end -> start, do dfs