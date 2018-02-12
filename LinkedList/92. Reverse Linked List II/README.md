Time spent : 30 min(Self + See hint)

Reverse a linked list from position m to n.

EXAMPLES:

```
Given 1->2->3->4->5->NULL, m = 2 and n = 4,

return 1->4->3->2->5->NULL.
```



In this problem, we should pay attention to three part.

1. The part before m.
2. The part between m and n.
3. The part after n.

The first and third part can be stored by two pointers, and the second part can be done just like reverse linked list I.

As usual, we need to keep a dummy head, and make curr point to dummy.

The first part we use `prev` pointer, the third part we use `tail` pointer. And in the second part, we use `front` to keep the previous node.

In the first part, we just need to move curr ahead. When it is done, we point prev to the curr, and curr become prev.next, that is the node on m. And **tail now becomes curr, cause we need to append the last node on n with the rest of linked list**.

At last, **tail.next = curr, prev.next = front**.



   1 ->      2 -> 3 -> 4          -> 5

prev       tail       prev         curr