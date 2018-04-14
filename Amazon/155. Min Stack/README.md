Time spent : 10 min (self)

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

- push(x) -- Push element x onto stack.
- pop() -- Removes the element on top of the stack.
- top() -- Get the top element.
- getMin() -- Retrieve the minimum element in the stack.



1. We can use just one stack to achieve this.
2. When we push the number, we compare the number with the global min, if it is equal or smaller than the number, we push the smaller first, cause if we pop a min number, we need to know the second minimum number.

