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

This is typical BFS problem. 

1st question is should we start from building and find the distance to all the empty position, or should we start from empty space and find the distance to all the building? Quoted FLAGbigoffer'comment in https://leetcode.com/problems/shortest-distance-from-all-buildings/discuss/76891/Java-solution-with-explanation-and-time-complexity-analysis. 'Does anyone want to ask `Why don't we start from '0'?` This is also what I am thinking. At the first glance, the time complexity of starting from buildings `O(B*M*N) (B: # of buildings)` and starting from empty places `O(E*M*N) (E: # of empty places)` might be the same. If in an interview, I think we can ask for clarification. If the empty places are far more than buildings, ex. we have 1 million empty places and only 1 building, starting from building is better. So it depends on how many empty places and buildings that we have. We are not going to say this way or that way is better, but it's a kind of trade-off.'

