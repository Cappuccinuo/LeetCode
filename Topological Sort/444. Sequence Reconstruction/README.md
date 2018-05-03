Time spent : 30 min(see hint)

GIVEN: an original sequence and sequences

RETURNS: If the org sequence can be reconstructed by sequences

**Example 1:**

```
Input:
org: [1,2,3], seqs: [[1,2],[1,3]]

Output:
false

Explanation:
[1,2,3] is not the only one sequence that can be reconstructed, because [1,3,2] is also a valid sequence that can be reconstructed.
```

**Example 2:**

```
Input:
org: [1,2,3], seqs: [[1,2]]

Output:
false

Explanation:
The reconstructed sequence can only be [1,2].
```

**Example 3:**

```
Input:
org: [1,2,3], seqs: [[1,2],[1,3],[2,3]]

Output:
true

Explanation:
The sequences [1,2], [1,3], and [2,3] can uniquely reconstruct the original sequence [1,2,3].
```

**Example 4:**

```
Input:
org: [4,1,5,2,6,3], seqs: [[5,2,6,3],[4,1,5,2]]

Output:
true
```



Topological Sort:

1. Construct the graph, using Map<Integer, Set<Integer>>. Set<Integer> is the neighbours of the node. Build another map to record the indegree of every node
2. As we need the order is exactly like in org. There can be only one element in queue each time. Otherwise the order can be different. 