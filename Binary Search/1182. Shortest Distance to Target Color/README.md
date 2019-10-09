Time spent :  10 min(Self)

GIVEN: You are given an array `colors`, in which there are three colors: `1`, `2` and `3`. You are also given some queries. Each query consists of two integers `i` and `c`

RETURNS: return the shortest distance between the given index `i` and the target color `c`. If there is no solution return `-1`.

EXAMPLES:

**Example 1:**

```
Input: colors = [1,1,2,1,3,2,2,3,3], queries = [[1,3],[2,2],[6,1]]
Output: [3,0,3]
Explanation: 
The nearest 3 from index 1 is at index 4 (3 steps away).
The nearest 2 from index 2 is at index 2 itself (0 steps away).
The nearest 1 from index 6 is at index 3 (3 steps away).
```

**Example 2:**

```
Input: colors = [1,2], queries = [[0,3]]
Output: [-1]
Explanation: There is no 3 in the array.
```

Algorithm:

Store the index of each color in arraylist, and using binary search to find the closest one.