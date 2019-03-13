Time spent :  10 min

GIVEN: N nodes, and edges array

RETURNS: a list of MHT root labels

Note: For an undirected graph with tree characteristics, we can choose any node as the root. The result graph is then a rooted tree. Among all possible rooted trees, those with minimum height are called minimum height trees (MHTs).

EXAMPLES:

**Example 1 :**

```
Input: n = 4, edges = [[1, 0], [1, 2], [1, 3]]

        0
        |
        1
       / \
      2   3 

Output: [1]
```

**Example 2 :**

```
Input: n = 6, edges = [[0, 3], [1, 3], [2, 3], [4, 3], [5, 4]]

     0  1  2
      \ | /
        3
        |
        4
        |
        5 

Output: [3, 4]
```

Algorithm:

Start from leafs, which has indegree 1.

Do BFS on these leaf, during the traverse, using the idea of topological sort, decrease their degree(delete the leaf from graph), for their neighbours, also decrease their degree, when the neighbour's degree is 1, add to queue.

In the end, what left in the list, is the node connected to no nodes but each other, that will form the minimum height tree.