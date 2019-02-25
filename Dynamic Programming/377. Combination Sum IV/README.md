Time spent :  20 min(Self)

GIVEN: an integer array with all positive numbers and no duplicates

RETURNS: find the number of possible combinations that add up to a positive integer target.

EXAMPLES:

```
nums = [1, 2, 3]
target = 4

The possible combination ways are:
(1, 1, 1, 1)
(1, 1, 2)
(1, 2, 1)
(1, 3)
(2, 1, 1)
(2, 2)
(3, 1)

Note that different sequences are counted as different combinations.

Therefore the output is 7.
```

Algorithm:

At first I want to form dp\[i][j], represent using previous i numbers to form sum j.

Then I find that the status has no relationship with i.

So we just need to use dp[target].

dp[i] += dp[i - nums[j]] when i >= nums[j]

At last, we return dp[target]