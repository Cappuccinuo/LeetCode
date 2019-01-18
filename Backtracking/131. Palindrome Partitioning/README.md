Time spent :  10 min(Self)

GIVEN: a string s

RETURNS: all possible palindrome partitioning of s

**Example:**

```
Input: "aab"
Output:
[
  ["aa","b"],
  ["a","a","b"]
]
```

Algorithm:

Backtracking. Everytime check if current substring is palindrome.