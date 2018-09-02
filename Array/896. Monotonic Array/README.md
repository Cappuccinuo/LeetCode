Time spent :  5 min(Self)

GIVEN: An array

RETURNS: True iff the given array is monotonic

EXAMPLES:

**Example 1:**

```
Input: [1,2,2,3]
Output: true
```

**Example 2:**

```
Input: [6,5,4,4]
Output: true
```

**Example 3:**

```
Input: [1,3,2]
Output: false
```

**Example 4:**

```
Input: [1,2,4,5]
Output: true
```

**Example 5:**

```
Input: [1,1,1]
Output: true
```

Algorithm:

Keep a variable to record Integer.compare(A[i], A[i - 1])