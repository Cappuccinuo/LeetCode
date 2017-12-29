Time spent : 60 min(See a little hint)

GIVEN: a dictionary and a sentence

RETURNS: the sentence after the replacement

**Example 1:**

```
Input: dict = ["cat", "bat", "rat"]
sentence = "the cattle was rattled by the battery"
Output: "the cat was rat by the bat"
```



1. The key problem is how to judge we append the original sentence word or prefix word.

2. Add a field word in the TireNode class

3. Split string using split("\\\s+")

4.         StringBuilder result = new StringBuilder();
          for (String word : sentence.split("\\s+")) {
              if (result.length() > 0) {
                  result.append(" ");
              }
              TrieNode current = root;
              for (Character c : word.toCharArray()) {
                  if (current.children.get(c) == null || current.endOfWord) {
                      break;
                  }
                  current = current.children.get(c);
              }
              // The dictionary tree has no current node, just append original word
              // Otherwise append the prefix.
              result.append(current.word != null ? current.word : word);
          }
  ​

