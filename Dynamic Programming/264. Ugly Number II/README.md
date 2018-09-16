Time spent :  20 min(Self)

GIVEN: a number n

RETURNS: the n-th ugly number (Ugly numbers are **positive numbers** whose prime factors only include `2, 3, 5`.)

EXAMPLES:

```
Input: n = 10
Output: 12
Explanation: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.
```

Algorithm:

1. Use Heap, every time poll the num, and offer num * 2, num * 3, num * 5. At last poll the top of heap.
2. Use DP, we have a, b, c three variables, and every time we add the min of list.get(a) * 2, list.get(b) * 3, list.get(c) * 5 to the list and add 1 to argmin a, b,c .