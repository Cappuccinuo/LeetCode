Time spent : 10 min(Self)

GIVEN: two sorted Linked Lists

RETURNS: a linked list that merge the two lists

EXAMPLES:

```
Input: (1 -> 4 -> 6)  (2 -> 7 -> 8)
Output: 1 -> 2 -> 4 -> 6 -> 7 -> 8
```



Use the dummy node. Make a temp node point to dummy. p and q point to l1 and l2

When the p or q are not null.

If p is null, temp.next = q, break the loop. Same to q.

If p and q both not null, p.val < q.val, temp.next = new ListNode(p.val).. same to the other situation.

