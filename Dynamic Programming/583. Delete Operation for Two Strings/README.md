Time spent :  20 min(see hint)

GIVEN: two words word1 and word2

RETURNS: the minimum number of steps required to make word1 and word2 the same

EXAMPLES:

```
Input: "sea", "eat"
Output: 2
Explanation: You need one step to make "sea" to "ea" and another step to make "eat" to "ea".
```

Algorithm:

Using longest common subsequence or without using longest common subsequence. (Dynamic Programming)

Use:

dp\[i][j] represents the length of the longest common subsequence up to i - 1 th index and j - 1 th index.

Not Use:

the number of deletions required to equalize the two strings