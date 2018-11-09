Time spent :  20 min(See hint)

GIVEN: n coins in a line. Two players take turns to take one or two coins from right side until there are no more coins left.

RETURNS: The player who take the coins with the most value wins

EXAMPLES:

Given values array A = `[1,2,2]`, return `true`.

Given A = `[1,2,4]`, return `false`.

Algorithm:

f[i] represents the maximum value first can get, picking from ith coin.

sum[i] represents the total sum of coins from i to n - 1.

f[i] is related to f[i - 1] and f[i - 2], if we pick 1 coin, then f[i - 1] can be viewed as the best opponent can get, and what we can get is sum[i] - f[i - 1], same to take 2 coins, what we can get is sum[i] - f[i - 2].

So f[i] = Math.max(sum[i] - f[i - 1], sum[i] - f[i - 2]).

We need to traverse from the back of the array, cause our f[i] represents the max value to pick from ith coin.