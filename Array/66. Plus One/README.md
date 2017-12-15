Time spent : 10 min(See other's thought)



GIVEN: a non-negative integer represented as a non-empty array of digits

RETURNS: array after plus one to the original integer



EXAMPLES:

Input: 

```
[9, 9, 9, 9]
```

Output: [1, 0, 0, 0, 0]



This is not complicated as linkedlist version plus one, no need to use a stack.

First, check array from tail. If that one is not 9, just add 1 to it, and return digits. Otherwise, change that one to 0. Continue to next digit.

If all digits have been add 1, new an array with size len+1, result[0] = 1, the other one is default 0.