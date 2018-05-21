Time spent : 10 min(Self)

GIVEN: an infinite sequence 1, 2, 3, 4… 11, 12

RETURNS: the nth digit of the sequence



**Example 1:**

```
Input:
3

Output:
3
```

**Example 2:**

```
Input:
11

Output:
0

Explanation:
The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, which is part of the number 10.
```

------

We need three fields to record current number length, a number count, and start number.

When n is large that len * count, we add the digit length, subtract the numbers of previous length. e.g. length of 2 has 10 - 99, that is 99 - 9 = 90. start will become 10 times of previous start, so as count.

At last, the start will become start + (n - 1) / len. That is the final number where the nth digit in.