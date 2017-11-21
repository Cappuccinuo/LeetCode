Time spent : 50 min

Solution : BFS	

GIVEN: a TreeNode

RETURNS: the average value of the nodes on each level in the form of an array

EXAMPLES:

Input: 

```
    3
   / \
  9  20
    /  \
   15   7
```

Output: [3, 14.5, 11]

DESIGN STRATEGY: BFS



 In BFS, we start by pushing the root node into a queuequeue. Then, we remove an element(node) from the front of the queuequeue. For every node removed from the queuequeue, we add all its children to the back of the same queuequeue. We keep on continuing this process till the queuequeue becomes empty. In this way, we can traverse the given tree on a level-by-level basis.

But, in the current implementation, we need to do a slight modification, since we need to separate the nodes on one level from that of the other.

The steps to be performed are listed below:

1. Put the root node into the queue.
2. Initialize sum and count as 0 and **temp as an empty queue**.
3. Pop a node from the front of the queue. Add this node's value to the sum corresponding to the current level. Also, update the count corresponding to the current level.
4. **Put the children nodes of the node last popped into the a temp queue(instead of queue).**
5. Continue steps 3 and 4 till queue becomes empty. (An empty queue indicates that one level of the tree has been considered).
6. **Reinitialize queuequeue with its value as temp.**
7. Populate the res array with the average corresponding to the current level.
8. Repeat steps 2 to 7 till the queue and temp become empty.