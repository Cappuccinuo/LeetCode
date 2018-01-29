Time spent : 40 min(see hint)

GIVEN: the posts number n of a fence, and the k colors that each post can be painted with

RETURNS: total number of ways can paint the fence

Note: no more than two adjacent fence posts have the same color, not adjacent fence cannot have the same color



**The basic idea is, the current fence color can be two situation, not the same color with the previous one, or not the same color with the one before the previous one. That is dp[3] = dp[2] * (k - 1) + dp[1] * (k - 1)**

n = 0, return 0.

n = 1, return k.

n = 2, return k * k.

n = 3, if 1 and 2 are the same color, (k - 1) * k possible ways. 

​								(11(234…k), 22(134…k),…kk0(123…k-1)) -> k * k - 1

​           if 1 and 2 are not the same color, k * (k - 1) * k possible ways.



So the formula is   dp[i] = (k - 1) * (dp[i - 1] + dp[i - 2])