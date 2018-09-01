Time spent :  15 min(Self)

GIVEN: An array of strings

RETURNS: Group anagrams together

EXAMPLES:

```
Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
```

Algorithm:

Everytime we find a str, we transfer it to char array and sort it. If it exists in hashmap, we add it.