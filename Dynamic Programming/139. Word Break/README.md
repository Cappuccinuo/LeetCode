Time spent : 30 min(See hint)

GIVEN: a non-empty string s and a dictionary wordDict containing a list of non-empty words

RETURNS: true iff s can be segmented into a space-separated sequence of one or more dictionary words.

EXAMPLES:

Input: 

```
s = "leetcode"
dict = ["leet", "code"].
```

Output: true



This given problem s can be divided into subproblems s1 and s2. If these subproblems individually satisfy the required conditions, the complete problem s also satisfies the same. Eg, "leetcode" can be split into two substrings "lee", "tcode". The subproblem "lee" can bee further divided into "l" "ee", which individually are a part of dictionary making "lee" satisfy the condition. Going further backwards, "lee" "tcode" also satisfy the required criteria individually leading to the complete string "leetcode" also to satisfy the criteria.

As to the dp array formation, we make use of dp array of size n + 1, where n is the length of the given string. We also use two index pointers i and j, where i refers to the length of the substring considered currently starting from the beginning, and j refers to the index partitioning the current substring into smaller substrings (0, j) and (j + 1, i).

dp[0] = true, since the null string is always present in the dictionary, and the rest false.

We consider substrings of all possible lengths starting from the beginning by make use of index i.

For every such substring, we partition the string into two further substrings s1 and s2 in all possible ways using the index j(i now refers to the ending index of s2). To fill in the entry dp[i], we check if the dp[j] contains true, i.e. if the substring s1 fulfills the required criteria. If so, we further check if s2 is present in the dictionary. If both the strings fulfill the criteria, we make dp[i] as true, otherwise as false.

