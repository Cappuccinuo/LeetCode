Time spent :  60 min(Self)

GIVEN: an array of n distinct non-empty strings

RETURNS: **minimal** possible abbreviations for every word following rules 

1. Begin with the first character and then the number of characters abbreviated, which followed by the last character.
2. If there are any conflict, that is more than one words share the same abbreviation, a longer prefix is used instead of only the first character until making the map from word to abbreviation become unique. In other words, a final abbreviation cannot map to more than one original words.
3. If the abbreviation doesn't make the word shorter, then keep it as original.

EXAMPLES:

**Example:**

```
Input: ["like", "god", "internal", "me", "internet", "interval", "intension", "face", "intrusion"]
Output: ["l2e","god","internal","me","i6t","interval","inte4n","f2e","intr4n"]
```

Algorithm:

```java
		// First Step
        getAbbrWordsMapping(abbrWordsMapping, dict);

        // Second Step
        getWordAbbrMapping(wordAbbrMapping, abbrWordsMapping);
        
        // Final Step
        for (String word : dict) {
            result.add(wordAbbrMapping.get(word));
        }
```

See code for trie implementation.