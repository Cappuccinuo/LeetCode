Time spent : 20 min(See solution)

Solution : Merge Sort



Merge : 

Given : Two ListNode

Returns : a new listnode

if l1 is null, return l2. same to l2.

if l1.val < l2.val, l1.next = merge(l1.next, l2)

return l1, same to l2



SortList:

Divide the list into two halves, use slow and fast pointer