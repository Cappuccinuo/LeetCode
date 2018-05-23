Time spent : 20 min(see hint)

GIVEN: a string S

RETURNS: check if the letters can be rearranged so that two characters that are adjacent to each other are not the same.If possible, output any possible result.  If not possible, return the empty string.

**Example 1:**

```
Input: S = "aab"
Output: "aba"
```

**Example 2:**

```
Input: S = "aaab"
Output: ""
```

 

1. If the frequency of a letter is (N + 1) / 2, then it is impossible, return ""
2. Otherwise we use a greedy thought, that is everytime we return the current top 2 letters to form a string and append others. A heap is an ideal structure.