Time spent :  20 min(Self)

GIVEN: Two strings 

RETURNS: The longest common subsequence



**Example 1:**

For `"ABCD"` and `"EDCA"`, the *LCS* is `"A"` (or `"D"`, `"C"`), return `1`.

For `"ABCD"` and `"EACB"`, the *LCS* is `"AC"`, return `2`.



Algorithm:

dp\[i][j] represents that the first i chars int A and first j chars in B, LCS length.

dp\[i][j] = Math.max(dp\[i - 1][j - 1] + 1, dp\[i - 1][j], dp\[i][j - 1]) when Ai = Bj.

Otherwise pick the max of dp\[i - 1][j], dp\[i][j - 1]

dp\[i - 1][j] represents that the ith char of A is not in the common subsequence, dp\[i][j - 1] represents that the jth char of B is not in the common subsequence.