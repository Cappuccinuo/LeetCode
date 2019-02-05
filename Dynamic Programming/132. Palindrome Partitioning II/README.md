Time spent :  10 min(See hint)

GIVEN: a string s

RETURNS: the minimum cuts needed for a palindrome patitioning of s

EXAMPLES:

**Example:**

```
Input: "aab"
Output: 1
Explanation: The palindrome partitioning ["aa","b"] could be produced using 1 cut.
```

Algorithm:

If we know whether a string from index i to index j is a palindrome, we can use dynamic programming to solve this problem.

We use dp[i] to represent for length i, the minimum possible palindrome in this string. For example in aabbccdd, if length is 2, then the minimum is 2, aa, bb, cc, dd. Then we traverse all the j before i.

If string from j to  i is palindrome, and dp[j] + 1 < dp[i], then we can update dp[i] = dp[j] + 1.

At last, we return dp[len] - 1.