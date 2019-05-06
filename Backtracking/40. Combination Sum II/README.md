Time spent :  5 min(Self)

GIVEN:   a collection of candidate numbers (`candidates`) and a target number (`target`)

RETURNS: all unique combinations in `candidates` where the candidate numbers sums to `target`.

EXAMPLES:

**Example 1:**

```
Input: candidates = [10,1,2,7,6,1,5], target = 8,
A solution set is:
[
  [1, 7],
  [1, 2, 5],
  [2, 6],
  [1, 1, 6]
]
```

**Example 2:**

```
Input: candidates = [2,5,2,1,2], target = 5,
A solution set is:
[
  [1,2,2],
  [5]
]
```

Algorithm:

To eliminate the duplicate, we need to check current number and previous number when backtrack.