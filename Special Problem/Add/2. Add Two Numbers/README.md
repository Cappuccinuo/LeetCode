Time spent : 10 min(See solution)

GIVEN: two non-empty linked lists representing two non-negative integers

RETURNS: linked list of their sum

EXAMPLES:

```
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
```



![Illustration of Adding two numbers](https://leetcode.com/problems/add-two-numbers/Figures/2_add_two_numbers.svg)

*Figure 1. Visualization of the addition of two numbers: 342 + 465 = 807.Each node contains a single digit and the digits are stored in reverse order.*



The pseudocode is as following:

- Initialize current node to dummy head of the returning list.
- Initialize carry to 00.
- Initialize pp and qq to head of l1l1 and l2l2 respectively.
- Loop through lists l1 and l2 until you reach both ends.
  - Set x to node p's value. If pp has reached the end of l1, set to 0.
  - Set y to node q's value. If qq has reached the end of l2, set to 0.
  - Set sum = x + y + carry
  - Update carry = sum / 10
  - Create a new node with the digit value of (summod10) and set it to current node's next, then advance current node to next.
  - Advance both p and q.
- Check if carry = 1, if so append a new node with digit 1 to the returning list.
- Return dummy head's next node.

