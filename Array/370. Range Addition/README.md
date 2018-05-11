Time spent : 20 min(Self)

GIVEN: An array of length n initialized with all 0's and are given k update operations

RETURNS: the modified array after k operations were executed

**Example:**

```
Given:

    length = 5,
    updates = [
        [1,  3,  2],
        [2,  4,  3],
        [0,  2, -2]
    ]

Output:

    [-2, 0, 3, 5, 3]
```

**Explanation:**

```
Initial state:
[ 0, 0, 0, 0, 0 ]

After applying operation [1, 3, 2]:
[ 0, 2, 2, 2, 0 ]

After applying operation [2, 4, 3]:
[ 0, 2, 5, 5, 3 ]

After applying operation [0, 2, -2]:
[-2, 0, 3, 5, 3 ]
```



1. The naive version is to execute the updates one by one. // 132ms
2. Puts inc at startIndex and -inc at endIndex + 1. At last, we make result[i] += result[i - 1].

Reference: [Detailed explanation if you don't understand, especially "put negative inc at [endIndex+1]"](https://leetcode.com/problems/range-addition/discuss/84225/Detailed-explanation-if-you-don't-understand-especially-%22put-negative-inc-at-endIndex+1%22)

Now think in a simpler way first, if you have **only one update operation**, suppose input is (n = 5, updates = { {1, 3, 2} }), what does the O(n + k) solution do?

- Initialize the result array as length of n + 1, because we will operate on endIndex + 1:
  result = [0, 0, 0, 0, 0, 0]
- Then marks index 1 as 2 and marks index 3+1 as -2:
  result = [0, 2, 0, 0, -2, 0]
- Next, iterate through result, and accumulates previous sum to current position, just like [303. Range Sum Query - Immutable](https://leetcode.com/problems/range-sum-query-immutable/):
  result = [0, 0 + 2, 0 + 2, 0 + 2, 2 + (-2), 0] = [0, 2, 2, 2, 0, 0]
- Finally, trivial work to discard the last element because we don't need it:
  result = [0, 2, 2, 2, 0], which is the final result.

