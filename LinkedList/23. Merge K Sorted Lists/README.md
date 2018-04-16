Time spent : 20 min(Self)

GIVEN: k sorted Linked Lists

RETURNS: a linked list that merge the k lists

EXAMPLES:

```
Input:
[
  1->4->5,
  1->3->4,
  2->6
]
Output: 1->1->2->3->4->4->5->6
```



Use the priority queue(heap) to record the current k front node. For example, 1, 1, and 2, which is a min heap.

Everytime we need to extract the min node, then move it forward, add to heap. When the heap is empty, we finish the merge.

