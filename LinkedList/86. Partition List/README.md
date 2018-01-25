Time spent : 10 min(self)

Given a linked list and a value *x*, partition it such that all nodes less than *x* come before nodes greater than or equal to *x*.

EXAMPLES:

```
Given 1->4->3->2->5->2 and x = 3,
return 1->2->2->4->3->5.
```



Two dummy list small and large, if current val < x, append to small, else append to large. At last, smallTail.next = large.next, largeTail.next = null. Return small.next.