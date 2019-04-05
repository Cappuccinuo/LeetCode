Time spent :  10 min(Self)

GIVEN: Given a 2D array `A`, each cell is 0 (representing sea) or 1 (representing land) A move consists of walking from one land square 4-directionally to another land square, or off the boundary of the grid.

RETURNS: Return the number of land squares in the grid for which we **cannot** walk off the boundary of the grid in any number of moves.

EXAMPLES:

**Example 1:**

```
Input: [[0,0,0,0],[1,0,1,0],[0,1,1,0],[0,0,0,0]]
Output: 3
Explanation: 
There are three 1s that are enclosed by 0s, and one 1 that isn't enclosed because its on the boundary.
```

**Example 2:**

```
Input: [[0,1,1,0],[0,0,1,0],[0,0,1,0],[0,0,0,0]]
Output: 0
Explanation: 
All 1s are either on the boundary or can reach the boundary.
```

Algorithm:

Can use BFS, DFS, Union-Find, typical graph problem.