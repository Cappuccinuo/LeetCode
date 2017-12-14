Time spent : 15 min(Self)

Design a data structure that supports the following two operations:

```
void addWord(word)
bool search(word)

```

search(word) can search a literal word or a regular expression string containing only letters `a-z` or `.`. A `.` means it can represent any one letter.

EXAMPLES:

```
addWord("bad")
addWord("dad")
addWord("mad")
search("pad") -> false
search("bad") -> true
search(".ad") -> true
search("b..") -> true
```



1. No doubt this problem is use Trie.
2. Add word is simple. The key part is how to search a word with '.' - Recursion.
3. When there is '.', we set current to all the node in the current's children.  The result is the "or" result of all the nodes.