Time spent :  20 min(Self)

GIVEN: Matrix

RETURNS: Shortest distance to reach all buildings from one point

EXAMPLES:

```
Input: [[1,0,2,0,1],[0,0,0,0,0],[0,0,1,0,0]]

1 - 0 - 2 - 0 - 1
|   |   |   |   |
0 - 0 - 0 - 0 - 0
|   |   |   |   |
0 - 0 - 1 - 0 - 0

Output: 7 

Explanation: Given three buildings at (0,0), (0,4), (2,2), and an obstacle at (0,2),
             the point (1,2) is an ideal empty land to build a house, as the total 
             travel distance of 3+3+1=7 is minimal. So return 7.
```

Algorithm:

For every matrix\[i][j] == 0, do BFS and get the shortest distance from that point to all buildings.

We need to treat 0, 1, 2 differently. For 0, we offer them to queue, for 1, we add current distance to final result, for 2 we just continue.