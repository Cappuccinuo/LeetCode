Time: 30min(See hint)

Design an algorithm to serialize and deserialize a binary tree.



```
Example: 

You may serialize the following tree:

    1
   / \
  2   3
     / \
    4   5

as "[1,2,3,null,null,4,5]"
```



In the serialize method. Use an arraylist as a queue, add val to the queue (root, root.left, root.right)... For last null value, we eliminate them if no val available. For serializtion, we use a stringbuilder, # to represent null value.

In the deserialize method, we need to record which node we currently traverse, as we need to assign left and right to it.