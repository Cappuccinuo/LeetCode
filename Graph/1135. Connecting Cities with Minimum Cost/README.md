Time spent :  10 min

GIVEN: There are `N` cities numbered from 1 to `N`.

You are given `connections`, where each `connections[i] = [city1, city2, cost]` represents the cost to connect `city1` and `city2` together. 

RETURNS: Return the minimum cost so that for every pair of cities, there exists a path of connections (possibly of length 1) that connects those two cities together. -1 if impossible.

EXAMPLES:

**Example 1:**

![img](https://assets.leetcode.com/uploads/2019/04/20/1314_ex2.png)

```
Input: N = 3, connections = [[1,2,5],[1,3,6],[2,3,1]]
Output: 6
Explanation: 
Choosing any 2 edges will connect all cities so we choose the minimum 2.
```

**Example 2:**

![img](https://assets.leetcode.com/uploads/2019/04/20/1314_ex1.png)

```
Input: N = 4, connections = [[1,2,3],[3,4,4]]
Output: -1
Explanation: 
There is no way to connect all cities even if all edges are used.
```

Algorithm:

[Reference][https://leetcode.com/problems/connecting-cities-with-minimum-cost/discuss/346137/Java-Prim's-Algorithm-with-Priority-Queue]

For Prim's Algorithm we use a Priority Queue to get the edge with least cost, and a visited set to keep nodes that are added to the MST.



1. Build the graph based on the edges.
2. Randomly pick a node to start with(in this case, pick node with id 1).
3. Pop the edge with least cost:
   - if the edge does **NOT** exist in the MST(visited set), add its cost to total cost and add new edges starting from the end node to the queue.
   - if the edge does exist in the MST(visted set)