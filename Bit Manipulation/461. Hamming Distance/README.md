Time spent : 5 min (self)

GIVEN: two integers

RETURNS: count of how many bits of them is different

EXAMPLES:

```
Input: x = 1, y = 4

Output: 2


Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.
```

Use a mask initially 1.

Every time (x & mask) != (y & mask) count as a differet situation.