Time spent :  10 min(Self)

GIVEN: Given an N x N `grid` containing only values `0` and `1`, where `0` represents water and `1` represents land

RETURNS: find a water cell such that its distance to the nearest land cell is maximized and return the distance.

EXAMPLES:

**Example 1:**

**![img](https://assets.leetcode.com/uploads/2019/05/03/1336_ex1.JPG)**

```
Input: [[1,0,1],[0,0,0],[1,0,1]]
Output: 2
Explanation: 
The cell (1, 1) is as far as possible from all the land with distance 2.
```

**Example 2:**

**![img](https://assets.leetcode.com/uploads/2019/05/03/1336_ex2.JPG)**

```
Input: [[1,0,0],[0,0,0],[0,0,0]]
Output: 4
Explanation: 
The cell (2, 2) is as far as possible from all the land with distance 4.
```

Algorithm:

Put all the island in queue, and find the furthest water.