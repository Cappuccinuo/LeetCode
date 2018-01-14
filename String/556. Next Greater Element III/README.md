Time spent : 60 min(self)

GIVEN: a positive 32-bit integer n

RETURNS: the smallest 32-bit integer which has exactly the same digits existing in n and iis greater in value than n.

Note : If no such positive **32-bit** integer exists, you need to return -1.

EXAMPLES:

```
Input: 12
Output: 21
```

```
Input: 21
Output: -1
```



1. For a integer like 124433221, we can go through from the tail. When 4 > 2, we know we can change the number.
2. Go through the number and find the next number just larger than 2, that will be the second 3. The integer will be like 134432221, it's easy to find that we just need to reverse 4432221, that is 131222344.
3. All the execution is use string and char array.
4. Use try catch to deal with 1999999999

