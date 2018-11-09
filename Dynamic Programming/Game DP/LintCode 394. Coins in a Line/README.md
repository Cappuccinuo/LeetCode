Time spent :  10 min(Self)

GIVEN: n coins in a line. Two players take turns to take one or two coins from right side until there are no more coins left.

RETURNS: The first play will win or lose.

EXAMPLES:

n = `1`, return `true`.

n = `2`, return `true`.

n = `3`, return `false`.

n = `4`, return `true`.

n = `5`, return `true`.

Algorithm:

If there are only 1 coin or 2 coins, the first play will always win. 

If there are 3 coins, if we take 1 coin or 2 coins, our opponent will take 2 coins or 1 coin, so we will not win.

So our dp function, dp[i] represents if there are i coins left, if the first play can win.

dp[i] depends on dp[i - 1] and dp[i - 2]. Cause we can take one coin or two coins.

If dp[i - 1] and dp[i - 2] both wins, then no matter I pick 1 or 2 coins at first, opponent will win. (We can view opponent as first after we move)

If dp[i - 1] lose and dp[i - 2] win, we can just pick 1 coins, so that our opponent will definitely lose, cause opponent will have i - 1 left.

Same applies to dp[i - 2] win and dp[i - 1] lose.