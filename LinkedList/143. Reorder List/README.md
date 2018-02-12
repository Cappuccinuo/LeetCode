Time spent : 30 min(Self + See hint)

EXAMPLES:

```
Given a singly linked list L: L0→L1→…→Ln-1→Ln,
reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
```



There are three steps to solve the problem.

Deal with several case below:

1. empty linked list
2.    1 -> null
3.    1 -> 2 -> 3 -> 4
4.    1 -> 2 -> 3 -> 4 -> 5

For the first two situations, the answer is just the linked list itself.

We can see that the actually steps are 1 -> 2 merge with 4 -> 3, that gives us intuition that, we can use slow/fast pointer to first find the middle point, then reverse the linked list from the middlepoint, then merge with original head.



a. use fast and slow pointer to find the middle point. For this part, the tricky part is we need to **keep a prev pointer to keep the record of point before middle point**. And prev.next = null to make the first half.

b. Reverse the list from slow, as the secondHalf.

c. Merge firstHalf, secondHalf.