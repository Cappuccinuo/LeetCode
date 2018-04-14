Time spent : 10 min(Self)

Solution : DFS

GIVEN: a set of distinct integers

RETURNS: All possible subsets

For example,
If **nums** = `[1,2,3]`, a solution is:

```
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
```



DFS:

We transfer the problem to 0/1 problem, that is for a specific num, we choose from pick or not pick.

First we need to sort the nums, so that every subset is in order. Then we do dfs from index 0.

In DFS, if we choose to use the number, we add it to subset. Then we remove it from the subset, both the situation we need to dfs for the next index.

At the exit of DFS, we need to pay attention to use the deep copy of subset, that is new LinkedList<Integer>(subset).