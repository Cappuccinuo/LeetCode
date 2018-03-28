Time spent : 30 min(See hint)

GIVEN: a sorted array, two integers k and x

RETURNS: find the k closest elements to x in the array, result should be sorted in ascending order. If there is a tie, smaller elements are prefered.

**Example 1:**

```
Input: [1,2,3,4,5], k=4, x=3
Output: [1,2,3,4]
```

**Example 2:**

```
Input: [1,2,3,4,5], k=4, x=-1
Output: [1,2,3,4]
```

DESIGN STRATEGY: Binary Search + Two Pointers



Thought: find the last position that smaller than target, make two pointers, left from this position, right is left + 1. Then we need a function to check if left is smaller, if so, add left to list, left—. So as right part.