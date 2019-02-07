Time spent :  15 min(See hint)

GIVEN: Equations are given in the format `A / B = k`, where `A` and `B` are variables represented as strings, and `k` is a real number (floating point number). 

RETURNS: Given some queries, return the answers. If the answer does not exist, return `-1.0`.

EXAMPLES:

**Example:**
Given `a / b = 2.0, b / c = 3.0.` 
queries are: `a / c = ?, b / a = ?, a / e = ?, a / a = ?, x / x = ? .` 
return `[6.0, 0.5, -1.0, 1.0, -1.0 ].`

Algorithm:

Basically this is a graph problem. First construct the graph, then conduct BFS on it. Here I use a pair class, store neighbour value and their division. 