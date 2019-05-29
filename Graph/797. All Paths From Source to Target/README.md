Time spent :  10 min(Self)

GIVEN: Given a directed, acyclic graph of `N` nodes. 

RETURNS: Find all possible paths from node `0` to node `N-1`, and return them in any order.

```
Example:
Input: [[1,2], [3], [3], []] 
Output: [[0,1,3],[0,2,3]] 
Explanation: The graph looks like this:
0--->1
|    |
v    v
2--->3
There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.
```

Algorithm:

Using backtracking. 