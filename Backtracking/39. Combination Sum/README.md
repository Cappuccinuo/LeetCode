Time spent :  5 min(Self)

GIVEN: Given a **set** of candidate numbers (`candidates`) **(without duplicates)** and a target number (`target`)

RETURNS: find all unique combinations in `candidates` where the candidate numbers sums to `target`.

EXAMPLES:

**Example 1:**

```
Input: candidates = [2,3,6,7], target = 7,
A solution set is:
[
  [7],
  [2,2,3]
]
```

**Example 2:**

```
Input: candidates = [2,3,5], target = 8,
A solution set is:
[
  [2,2,2,2],
  [2,3,3],
  [3,5]
]
```

Algorithm:

Backtracking. The ending requirement is target < 0 or target == 0. Otherwise we first add current num in linkedlist, then backtracking on target - current num. Add list to result list should be deep copy.