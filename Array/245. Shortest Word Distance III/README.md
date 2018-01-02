Time spent : 20 min(Self + See hint)

GIVEN: a list of words and two words word1 and word2

RETURNS: the shortest distance between two words in the list

Note: word1 can be the same as word2

EXAMPLES:

```
Assume that words = ["practice", "makes", "perfect", "coding", "makes"].

Given word1 = “coding”, word2 = “makes”, return 1.
Given word1 = "makes", word2 = "makes", return 3.
```



Use the base code in Shortest Word Distance I.

Add a judging condition. Use curr and prev to record indices.

        if (word1.equals(word2)) {
            int prev = Integer.MAX_VALUE;
            int curr = -1;
            for (int i = 0; i < words.length; i++) {
                if (!words[i].equals(word1)) {
                    continue;
                }
                curr = i;
                if (prev != Integer.MAX_VALUE) {
                    minDistance = Math.min(minDistance, curr - prev);
                }
                prev = curr;
            }
            return minDistance;
        }