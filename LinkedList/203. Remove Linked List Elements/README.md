Time spent : 20 min(see hint)

Remove all elements from a linked list of integers that have value val

EXAMPLES:

```
Given: 1 --> 2 --> 6 -- > 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
```



1. The key point to this problem is to deal with continuous elements.
2. make two ListNode, one node current move one step every time to examine, temp keep the record.

        while (current != null && current.next != null) {
            if (current.next.val == val) {
                while (current.next != null && current.next.val == val) {
                    current = current.next;
                }
                temp.next = current.next;
            }
            current = current.next;
            temp = current;
        }