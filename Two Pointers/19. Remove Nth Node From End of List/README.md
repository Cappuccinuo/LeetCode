Time spent : 10 min(See hint)



GIVEN: a singly linked list

RETURNS: remove nth node from the end of list and return its head



```
   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5
```



1. Make two node point to dummy.
2. move fast n + 1 step ahead to advance the gap between fast and slow.
3. While fast is not null, move fast and slow one step each time.
4. when fast is null, slow is the listnode before the deleting node. So slow.next = slow.next.next