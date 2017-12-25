Time spent : 20 min(See hint)

Solution : Two pointers(fast and slow)

![Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/Figures/142/Slide1.PNG)

The thought is same as Linked List Cycle I

Once slow == fast, there is a cycle, otherwise return null.

If slow == fast, it may not be the start of cycle, maybe one point on the cycle. So we make slow = head, move slow and fast until they equal, that node is the begin node.