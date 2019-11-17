Time spent :  30 min(Self)

GIVEN: Given a list of pairs of equivalent words `synonyms` and a sentence `text`

RETURNS: all possible synonymous sentences **sorted lexicographically**.

EXAMPLES:

```
Input:
synonyms = [["happy","joy"],["sad","sorrow"],["joy","cheerful"]],
text = "I am happy today but was sad yesterday"
Output:
["I am cheerful today but was sad yesterday",
"I am cheerful today but was sorrow yesterday",
"I am happy today but was sad yesterday",
"I am happy today but was sorrow yesterday",
"I am joy today but was sad yesterday",
"I am joy today but was sorrow yesterday"]
```

Algorithm:

The algorithm is backtracking. Key part is to know the map of synonyms.

For a given word, we need a map to store its synonyms. Using unionfind, we can know which words are belonging to one synonyms group. During the union and find, we update this mapping.