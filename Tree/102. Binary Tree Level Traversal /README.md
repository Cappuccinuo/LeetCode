Time spent : 10 min (See hint)

Given a binary tree, return the *level order* traversal of its nodes' values. (ie, from left to right, level by level).

EXAMPLES:

Input: 

```
Given binary tree [3,9,20,null,null,15,7],
```

```
    3
   / \
  9  20
    /  \
   15   7
```

return its level order traversal as:

```
[
  [3],
  [9,20],
  [15,7]
]
```



We can see this problem is a BFS. So the key point is use a queue to control the flow. First push the root in the queue, then get the queue size. For i - queuesize, offer the front's left and right child(if null) to the queue, then add the queue's front to the level's sub-list. At last add the sub-list to the result list.