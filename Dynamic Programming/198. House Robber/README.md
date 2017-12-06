Time spent : 20 min

Solution : IntegerArray -> Integer

GIVEN: an integer array nums

RETURNS: maximum sum, which cannot add adjacent integer

EXAMPLES:

Input: 

```
[1,2,3,4,5,6,7]
```

Output: 16

Design strategy: Dynamic Programming



1. two integers, rob means max money can get if rob current house, notrob means max money can get if not rob current house
2. robcurrent = notrob + num[i], if rob current house, must not rob previous house
3. notrob = Math.max(notrob, rob), if not rob current house, the money is the max of robbed i-1 house and not robbed i-1 house.
4. rob = robcurrent



Let us denote that:

> *f*(*k*) = Largest amount that you can rob from the first *k* houses.
> Ai = Amount of money at the ith house.

Let us look at the case `n = 1`, clearly *f*(1) = A1.

Now, let us look at `n = 2`, which *f*(2) = max(A1, A2).

For `n = 3`, you have basically the following two options:

1. Rob the third house, and add its amount to the first house's amount.
2. Do not rob the third house, and stick with the maximum amount of the first two houses.

Clearly, you would want to choose the larger of the two options at each step.

Therefore, we could summarize the formula as following:

> *f*(*k*) = max(*f*(*k* – 2) + Ak, *f*(*k* – 1))

We choose the base case as *f*(–1) = *f*(0) = 0, which will greatly simplify our code as you can see.

