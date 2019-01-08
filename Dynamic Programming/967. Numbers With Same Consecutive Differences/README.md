Time spent : 5 min(See hint)

GIVEN: length N and difference K

RETURNS: Return all **non-negative** integers of length `N` such that the absolute difference between every two consecutive digits is `K`.

EXAMPLES:

**Example 1:**

```
Input: N = 3, K = 7
Output: [181,292,707,818,929]
Explanation: Note that 070 is not a valid number, because it has leading zeroes.
```

**Example 2:**

```
Input: N = 2, K = 1
Output: [10,12,21,23,32,34,43,45,54,56,65,67,76,78,87,89,98]
```

Algorithm:

Same strategy as Target Sum problem(using DP).

For each digit, there are two choices, x + k, or x - k.

If N = 3, K = 7

Initially, we store all the digit into a hashset, (1, 2, 3, 4, 5, 6, 7, 8, 9)

For each digit, there are two choices, x + k, x - k

So the result can be (18, 29, 70, 81, 92)

Next we extract the last digit again, do the two operation and check if it is out of bound. Everytime we need to use another set to store the new integer.