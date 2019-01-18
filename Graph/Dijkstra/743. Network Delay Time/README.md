Time spent :  30 min(See hint)

GIVEN: N network nodes, labelled 1 to N        a signal from a certain node `K`      N nodes

Note: Given `times`, a list of travel times as **directed** edges `times[i] = (u, v, w)`, where `u` is the source node, `v` is the target node, and `w` is the time it takes for a signal to travel from source to target.

RETURNS: How long will it take for all nodes to receive the signal? If it is impossible, return `-1`.

EXAMPLES:

[[2,1,1],[2,3,1],[3,4,1]]
4
2

-> 2

Algorithm:

Dijkstra Alg.

1. S = {v}   dist(v) = 0    U = {^v}
2. Pick the minimum distance point to v, put k in S
3. Update neighbours to v.

