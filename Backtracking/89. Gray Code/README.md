Time spent :  20 min(See hint)

GIVEN: non-negative integer n representing the total number of bits in the code.

RETURNS: the sequence of gray code. Start with 0.

EXAMPLES:

**Example 1:**

```
Input: 2
Output: [0,1,3,2]
Explanation:
00 - 0
01 - 1
11 - 3
10 - 2

For a given n, a gray code sequence may not be uniquely defined.
For example, [0,2,3,1] is also a valid gray code sequence.

00 - 0
10 - 2
11 - 3
01 - 1
```

**Example 2:**

```
Input: 0
Output: [0]
Explanation: We define the gray code sequence to begin with 0.
             A gray code sequence of n has size = 2n, which for n = 0 the size is 20 = 1.
             Therefore, for n = 0 the gray code sequence is [0].
```

Algorithm:

Use backtracking first. For 0, if n is 3, then 0 is represented as 000. The next number can be 001, 010 or 100. So we xor 0 with each bit, and try each number.