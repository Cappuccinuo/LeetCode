Time spent : 5 min(See hint)

GIVEN: Two images A and B, represented as binary, square matrices of the same size

RETURNS: the largest possible overlap

EXAMPLES:

**Example 1:**

```
Input: A = [[1,1,0],
            [0,1,0],
            [0,1,0]]
       B = [[0,0,0],
            [0,1,1],
            [0,0,1]]
Output: 3
Explanation: We slide A to right by 1 unit and down by 1 unit.
```

Algorithm:

We can see from the example that in A and B, A\[0][0] and B\[1][1] can be at the same position, A\[0][0] and B\[1][2]  can be at the same position, so what we can count is the delta between x and y of same 1 in A and B.   So we need to record the delta, if we say delta is 3, then their are 3 unit that are overlap.

e.g. In the example, A\[0][0] and B\[1][1], A\[0][1] and B\[1][2], A\[1][1] and B\[2][2].