Time spent :  10 min(Self)

GIVEN: Two sentences A and B

RETURNS: a list of all uncommon words

Note: A word is *uncommon* if it appears exactly once in one of the sentences, and does not appear in the other sentence.

EXAMPLES:

**Example 1:**

```
Input: A = "this apple is sweet", B = "this apple is sour"
Output: ["sweet","sour"]
```

**Example 2:**

```
Input: A = "apple apple", B = "banana"
Output: ["banana"]
```

Algorithm:

Use hashmap to store strs in A and B.