Time spent :  20 min(Self)

GIVEN: Given an array of non-negative integers

RETURNS:  reach the last index in the minimum number of jumps.

EXAMPLES: 

```
Input: [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2.
    Jump 1 step from index 0 to 1, then 3 steps to the last index.
```

Algorithm:

View this as a BFS problem, each index is a node. And we need to find the shortest path to last index.