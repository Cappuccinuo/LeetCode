Time spent : 30 min(Self)



GIVEN: a singly linked list with head node root and a number k

RETURNS: a linked list array after splitting linked list into k consecutive linked list parts



EXAMPLE:

```
Input: 
root = [1, 2, 3], k = 5
Output: [[1],[2],[3],[],[]]
Explanation:
The input and each element of the output are ListNodes, not arrays.
For example, the input root has root.val = 1, root.next.val = 2, \root.next.next.val = 3, and root.next.next.next = null.
The first element output[0] has output[0].val = 1, output[0].next = null.
The last element output[4] is null, but it's string representation as a ListNode is [].
```

```
Input: 
root = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], k = 3
Output: [[1, 2, 3, 4], [5, 6, 7], [8, 9, 10]]
Explanation:
The input has been split into consecutive parts with size difference at most 1, and earlier parts are a larger size than the later parts.
```



1. Traverse the linked list to get the number of node.
2. Every element in the array has count / k numbers, the left numbers will distributed in previous elements in array.
3. Pay attention to the part that use left, if the team is 0, which means parts are larger than the total number, we just need to assign each node to result array. Otherwise the root will become root.next, and left need decrease by 1.
4. And the tail of each element in the array should have no list node append, root.next = null.