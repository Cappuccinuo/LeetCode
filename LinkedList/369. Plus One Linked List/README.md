Time spent : 20 min(self)

GIVEN: a non-negative integer represented as non-empty a singly linked list of digits

RETURNS: digits linked list which plus one to the integer of original one

EXAMPLES:

```
Input:
1->2->3

Output:
1->2->4
```



Same idea with 445.



Solution 1 : First reverse the list, then do the same as add two number. Initial carry is 1.

Solution 2 : keep two pointer, one beforeNine pointer, keep the node before 9. If the lastNode.val != 9, then just add 1 to that node is ok. Otherwise add one two node before nine. Until the beforeNine node is equal to lastNode. Pay attention that the two node should be at first dummy.