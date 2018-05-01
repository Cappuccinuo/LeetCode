Time spent : 8min(self)

Solution : BFS

GIVEN: a binary tree

RETURNS: the *bottom-up level order* traversal of its nodes' values

EXAMPLES:

Input: 

```
    3
   / \
  9  20
    /  \
   15   7
```

Output: [  [15,7],  [9,20],  [3]]

DESIGN STRATEGY: BFS



1. When the root is null, return the result linkedlist
2. while the queue is not empty, set a integer which is the current queue's size, this integer can control the number of node go through each time. 
3. for (int i = 0; i < queue.size(); i++):  use another list<Integer> to store the num in this layer. If the top treenode's left is not null, offer the top.left to the queue, same happens to the right node.
4. At last, reverse the result list.
