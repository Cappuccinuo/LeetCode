Time spent : 40 min(See hint)

GIVEN: a linked list

RETURNS: True iff the linked list is palindrome



There are many cases in this senario.

Palindrome : 

[1, 1], [1, 2, 3, 2, 1], [1, 2, 2, 1], [], [1]

Not Palindrome :

[1, 2], [1, 2, 3, 2, 1, 6], [1, 2, 2, 1, 6]

If the head is null or the head.next is null, return true.

If head.val == head.next.val && head.next.next == null, return true.

We need two pointers to solve the problem. One is slow, one is current.

First slow points to head, current points to head.next

​	If head.val == current.next.val    (like 1 (slow) -> 2(current) -> 1(current.next)):

​		If current.next.next != null, return true. Cause if slow now points to head, then current.next.next == null if the list is palindrome.

​		Current.next = null, slow = slow.next, current = slow.next, we go back to current's next position and do the loop again.

​		If now current is null or slow.val == current.val, like (1 -> 2 -> 3(slow) 2 1) and (1 -> 2(slow) -> 2(current) 1), return true.

​	else, current = current.next