Time spent :  10 min(Self)

GIVEN: Given a set of **distinct** positive integers

RETURNS: find the largest subset such that every pair (Si, Sj) of elements in this subset satisfies:

Si % Sj = 0 or Sj % Si = 0.

EXAMPLES: 

**Example 1:**

```
Input: [1,2,3]
Output: [1,2] (of course, [1,3] will also be ok)
```

**Example 2:**

```
Input: [1,2,4,8]
Output: [1,2,4,8]
```

Algorithm:

Same as problem longest continuous increasing subsequence. O(n^2)