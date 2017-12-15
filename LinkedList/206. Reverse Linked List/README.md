Time spent : 30 min(Self)

GIVEN: a linked list

RETURNS: reversed linked list

EXAMPLES:

```
Input: (1 -> 4 -> 6)
Output: 6 -> 4 -> 1
```



Iterative : 

The best way to solve the problem is draw a picture, and the order of operation is very important.

1 -> 2 -> 3

We use a listnode temp to move the "Pointer"

First use a dummy node, we want to record the previous listnode, so the initial value is null.

As as the end, we need to assign temp to temp.next, so we need to record the position.

ListNode nextNode = temp.next

Then link temp.next to the previous listnode, that is dummy.

temp.next = dummy

Now we need to move on, dummy now become current temp, while temp become nextNode we recorded.

dummy = temp     temp = nextNode



Recursive :

If the head is null or head.next is null, which means it is the last node, return head.

ListNode nextNode = reverseList(head.next)



head.next.next = head  (change the direction of arrow)

head.next = null (make sure the arrow is one direction)

return nextNode



