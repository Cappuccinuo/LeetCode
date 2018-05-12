Time spent : 20 min (see hint)

Given two 1d vectors, implement an iterator to return their elements alternately.

**Example:**

```
Input:
v1 = [1,2]
v2 = [3,4,5,6] 

Output: [1,3,2,4,5,6]

Explanation: By calling next repeatedly until hasNext returns false, 
             the order of elements returned by next should be: [1,3,2,4,5,6].
```



1. Use a queue to store the two iterator of two lists.
2. Each time we call next, we poll a iterator from queue. If the iterator has next, we push the iterator to the queue.
