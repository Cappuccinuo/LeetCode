Time spent : 10 min(See hint)



GIVEN: a singly linked list

RETURNS: swap every two adjacent nodes and return its head



```
Given 1->2->3->4, you should return the list as 2->1->4->3.
```



1. Two ListNode first and second. dummy.next = head, and temp = dummy.
2. first is temp.next, second is temp.next.next. 
3. To swap, first.next = second.next, temp.next = second, temp.next.next = first
4. Temp = temp.next.next, go through the loop again.