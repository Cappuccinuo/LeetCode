Time spent : 15 min(Self)

GIVEN: n items with size Ai, an integer m denotes the size of the backpack

RETURNS: how full you can fill this backpack

EXAMPLES:

```
If we have 4 items with size [2, 3, 5, 7], the backpack size is 11, we can select [2, 3, 5], so that the max size we can fill this backpack is 10. If the backpack size is 12. we can select [2, 3, 7] so that we can fulfill the backpack.
```



f\[i][S] : First i item, can we pick some of them and form size S

function: f\[i][S] = f\[i - 1][S - A[i - 1]] || f\[i - 1][S]

Init: f\[i][0] = true, f\[0][1...target] = false

Ans: check all f\[n][j]