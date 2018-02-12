Time spent : 10 min(self)

GIVEN: an unsorted array of integers

RETURNS: the length of longest increasing subsequence



EXAMPLES:

Given `[10, 9, 2, 5, 3, 7, 101, 18]`,
The longest increasing subsequence is `[2, 3, 7, 101]`, therefore the length is `4`. Note that there may be more than one LIS combination, it is only necessary for you to return the length.



O(n^2) Solution:

make an DP array.

For 10, dp[0] = 1

For 10, 9, dp[1] = 1

For 10, 9, 2, dp[2] = 1,

For 10, 9, 2, 5, dp[3] = 2  (Since 2, 5 is increasing)

For 10, 9, 2, 5, 3, dp[4] = 2 (Since 2, 5 or 2, 3 is increasing)

For 10, 9, 2, 5, 3, 7, dp[5] = 3 (Since 2, 3, 7 or 2, 5, 7 is increasing)

For 10, 9, 2, 5, 3, 7, 101, dp[6] = 4 (Since 2, 3, 7, 101 is increasing)

...

So we traverse the array, and for every i, we compare num[i] with number before num[i]. If that one is smaller than num[i], the dp[i] should be max(dp[j]] + 1. And the result is max(dp[i]).