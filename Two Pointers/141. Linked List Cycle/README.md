Time spent : 20 min(See hint)

Solution : Two pointers(fast and slow) or HashSet



Solution 1 & 2:

fast = fast.next.next

slow = slow.next

when fast.next == null && fast == null, return false

Solution 3:

Set<ListNode> seenNode = new HashSet();

