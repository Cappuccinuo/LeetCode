Time spent :  50 min(Self)

GIVEN: A list of bus routes.

RETURNS: The least number of buses we must take to reach our destination

EXAMPLES:

```
Input: 
routes = [[1, 2, 7], [3, 6, 7]]
S = 1
T = 6
Output: 2
Explanation: 
The best strategy is take the first bus to the bus stop 7, then take the second bus to the bus stop 6.
```

Algorithm:

It is actually a problem of graph.

First we need to construct the graph. Instead of store bus station and its neighbor station, we store bus route. We initialize a map, key is bus stop, and value is its bus route. For example, in above example, our map is like

`(1, (0)), (2, (0)), (7, (0, 1), (3, 1), (6, 1))`

Then we can conduct BFS on the graph. We can traverse the route of S first. In our queue, we offer bus stop. Cause we need to calculate the bus we must take, so we need to split level. 

Everytime, we poll a bus stop. And for the routes of the stop, if we haven't visit the route, we traverse the bus stop on that route, if one of the stop is T, we just return the step. Otherwise we offer the stop.