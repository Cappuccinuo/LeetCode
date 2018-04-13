Time spent : 30min(see hint) 

GIVEN: an undirected graph node

RETURNS: clone the undirected graph

Nodes are labeled uniquely.

As an example, consider the serialized graph `{0,1,2#1,2#2,2}`.

The graph has a total of three nodes, and therefore contains three parts as separated by `#`.

1. First node is labeled as `0`. Connect node `0` to both nodes `1` and `2`.
2. Second node is labeled as `1`. Connect node `1` to node `2`.
3. Third node is labeled as `2`. Connect node `2` to node `2` (itself), thus forming a self-cycle.

Visually, the graph looks like the following:

```
       1
      / \
     /   \
    0 --- 2
         / \
         \_/
```



Three step:

1. find all the origin nodes, output a list, using BFS
2. Build a map between old nodes and new nodes, the new nodes have no neighbors now
3. Build the edge based on origin node's neighbor.