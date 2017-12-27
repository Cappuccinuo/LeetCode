Time spent : 20 min(see hint)

Remove all duplicates elements in a sorted linked list

EXAMPLES:

```
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
```



1. We can't use dummy in this situation, cause there maybe value that exists in the list that the same as dummy.
2. if current.next.val == current.val, current.next = current.next.next