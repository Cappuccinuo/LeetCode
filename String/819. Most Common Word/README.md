Time spent :  10 min(Self)

GIVEN: a paragraph and a list of banned words

RETURNS: the most frequent word that is not in the list of banned words

**Example:**

```
Input: 
paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
banned = ["hit"]
Output: "ball"
Explanation: 
"hit" occurs 3 times, but it is a banned word.
"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. 
Note that words in the paragraph are not case sensitive,
that punctuation is ignored (even if adjacent to words, such as "ball,"), 
and that "hit" isn't the answer even though it occurs more because it is banned.
```

Algorithm:

Pay attention to corner case like "a,a,a" count as "a a a".

Some functions:

Given a string array, add all the string in it to hashset.

Set<String> bannedWord = new HashSet(Arrays.asList(banned)).

- `\w` (word character) matches any single letter, number or underscore (same as `[a-zA-Z0-9_]`). The uppercase counterpart `\W` (non-word-character) matches any single character that doesn't match by `\w` (same as `[^a-zA-Z0-9_]`).

So first replace all the character like ',' into " ", and split the word array.

Return the key with largest value in hashMap:

Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey()