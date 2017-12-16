Time spent : 30 min(See solution)

Solution : Two Pointers



GIVEN: a singly linked list

RETURNS: linked list that group all odd nodes together followed by the even nodes



EXAMPLE: 

Given `1->2->3->4->5->NULL`,
return `1->3->5->2->4->NULL`.



odd.next = even.next

odd = odd.next

even.next = odd.next

even = even.next

![328_Odd_Even](/Users/cappuccinuo/Documents/GitHub/LeetCode/LinkedList/328. Odd Even Linked List/328_Odd_Even.svg)

