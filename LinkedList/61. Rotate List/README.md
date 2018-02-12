Time spent : 30 min(Self)

Given a list, rotate the list to the right by k places, where k is non-negative.

EXAMPLES:

```
Given 1->2->3->4->5->NULL and k = 2,

return 4->5->1->2->3->NULL.
```



There are several cases in this problem.

1. head is null or head.next is null
2. 1 -> 2 -> 3 -> 4 -> 5,  k = 5 or 10 or 15...
3. 1 -> 2 -> 3 -> 4 -> 5,  k = 3 or 6 or 9...

The first case just return the head is ok.

For the second one, suppose the linked list length is l, k % l == 0, that means, the rotate list is same as original list.

For the third one, when k = 3, the result is 3 -> 4 -> 5 -> 1 -> 2, we can divide the original list as two parts, first 1 -> 2, second 3 -> 4 -> 5, and append 1 -> 2 -> null to 3 -> 4 -> 5. So we need to keep the pointer to 2, and point that next to null, and keep te pointer to 3, that is the final return node. And we also need to keep the pointer to 5, point it to head, instead of null.

The method is similar to Reverse Linked List II. Instead we need to calculate the linked list length l at first.

When k = 6, we actually rotate the list to 5 -> 1 -> 2 -> 3 -> 4, that is k % l. So we need to change k to k % l.