Time spent : 15 min(See hint)

Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.

EXAMPLES:

```
Given the sorted linked list: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5
```



Recursive solution:

we can see that the root is the middle of the list, so we will use slow/fast pointer.

we need to keep a prev pointer, so that the next of node before slow should be null.

If prev is null, then head becomes null.

root.left is sortedListToBST(head), root.right is sortedListToBST(slow.next)