Time spent :  15 min(See hint)

GIVEN: An array of integers A with even length

RETURNS: true if and only if it is possible to reorder it such that A[2 * i + 1] = 2 * A[2 * i] for every 0 <= i < len(A) / 2

EXAMPLES:

**Example 1:**

```
Input: [3,1,3,6]
Output: false
```

**Example 2:**

```
Input: [2,1,2,6]
Output: false
```

**Example 3:**

```
Input: [4,-2,2,-4]
Output: true
Explanation: We can take two groups, [-2,-4] and [2,4] to form [-2,-4,2,4] or [2,4,-2,-4].
```

**Example 4:**

```
Input: [1,2,4,16,8,4]
Output: false
```

Algorithm:

When we come into x, it must pair with 2 * x. If we can write our array into absolute value sorted, we can just traverse the array, and check numbers one by one. We also need a map to keep record of the frequency of each element, if current element has frequency 0, it represent it has been consumed. If 2 * x's frequency is <= 0, then we return false.