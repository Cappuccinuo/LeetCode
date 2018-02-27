Time spent : 20 min(See hint)

Implementing Stack using Queues

1. Implementing using one queue. 

   In push method, after offer one element to the queue, rotate the queue before the new element to make the tail become the head.

2. Implementing using two queues. Push O(1), Pop O(n)

   Suppose there are two queues q1 and q2. We always offer new element to q1.

   So we need to pop the element from the top of stack, the element e is the last offered element in q1. As queue is FIFO, we can only remove the element after removing all the other elements before e.

   We can use q2 to store the element that polled from q1. At last, we swap q1 and q2 to keep q1 as our main queue.

   ![](https://leetcode.com/media/original_images/225_stack_using_queues_popA.png)

3. Implementing using two queues. Push O(n), Pop O(1)

   In this approach, we add new element to q2 and keep it as the top element, if q1 is not empty, we keep remove all elements in q1 and add them to q2,  in this way the new offered element can be in the front of queue. Same as above, we swap q1 and q2 to keep q1 as our main queue.

   ![](https://leetcode.com/media/original_images/225_stack_using_queues_pushB.png)

   ​

   ​