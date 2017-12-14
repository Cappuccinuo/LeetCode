Time spent : 40 min(See solution)

GIVEN: two non-empty linked lists representing two non-negative integers

RETURNS: linked list of their sum

EXAMPLES:

```
Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 8 -> 0 -> 7
Explanation: 7243 + 564 = 7807.
```



The pseudocode is as following:

- Initialize current node to dummy head of the returning list.
- Initialize p and q to head of l1 and l2 respectively.
- put two LinkNode's val into a stack
- Loop through stack s1 and stack s2 until you reach both ends.
  - Set x to stack s1's pop. If p has reached the end, set to 0.
  - Set y to node s2's value. If q has reached the end, set to 0.
  - Set sum = x + y + dummy.val
  - Update dummy.val = sum % 10
  - New a LinkNode head, val is sum / 10
  - head's next becomes dummy, dummy now point to head
- If the final dummy's val is 0, that means no carry, return dummy.next, otherwise return dummy

