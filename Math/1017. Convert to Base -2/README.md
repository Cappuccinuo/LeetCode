Time spent :  10 min(Self)

GIVEN: a number N

RETURNS: a string consisting of `"0"`s and `"1"`s that represents its value in base `**-2**` (negative two).

EXAMPLES:

**Example 1:**

```
Input: 2
Output: "110"
Explantion: (-2) ^ 2 + (-2) ^ 1 = 2
```

**Example 2:**

```
Input: 3
Output: "111"
Explantion: (-2) ^ 2 + (-2) ^ 1 + (-2) ^ 0 = 3
```

**Example 3:**

```
Input: 4
Output: "100"
Explantion: (-2) ^ 2 = 4
```

Algorithm:

Loop until N is 0. Every time we get the last digit of N by N & 1, insert it to stringbuilder, and make N as -(N >> 1).