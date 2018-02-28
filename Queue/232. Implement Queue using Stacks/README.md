Time spent : 20 min(See hint)

Implementing Queue using Stacks

1. Implementing using two stacks. Push O(n), Pop O(1)

   Suppose there are two stacks s1 and s2. 

   So we need to pop the first inserted element in the queue, the element e is at the bottom of s1 now. As stack is LIFO, we can only remove the element before removing all the other elements above e.

   We can use s2 to store the element that poped from s1. After we pop the element, we push the elements from s2 again.

   ![](https://leetcode.com/media/original_images/232_queue_using_stacksBPush.png)

2. Implementing using two stacks. Push O(1), Pop Amortized O(1)

   We have to remove element in front of the queue, the first inserted element in s1, which is at the bottom of s1. As the first approach, we have to pop all elements from s1, push them to s2, which will store the elements in reversed order. To pop the element, we simply just need to pop s2. When s2 is empty, the elements will transfer from s1 to s2 again.

   ![](https://leetcode.com/media/original_images/232_queue_using_stacksAPop.png)

   ​Note the time complexity of pop is amortized O(1), worst-case O(n) (When stack s2 is empty, algorithm pops n elements from stack s1 and pushes n elements to s2).