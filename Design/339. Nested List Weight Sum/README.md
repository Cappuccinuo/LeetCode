Time spent : 10min(see hint)

GIVEN: a list of NestedInteger

Implement: an iterator to flatten it.

EXAMPLES:

Input: 

```
[[1,1],2,[1,1]]
```

Output: [1,1,2,1,1]



1. Use a flatten helper do the recursion. Go through every elements in the nestedList, if the element is a integer, add it to an extra list. Otherwise do the recursion to the element.
2. Also we can use a stack to solve. First push all the nestedInteger in the stack in reverse order. Than in hasNext() part, we check if the stack is empty. If not, and if the top one is a Integer, return true. Otherwise push all the element in the top to the stack in reverse order. So in the next() part, we can just getInteger of the top.
