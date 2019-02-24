Time spent : 5 min(See hint)

GIVEN: a non-empty array of integers, every element appears three times except for one, which appears exactly once.

RETURNS: The single number

**Example 1:**

```
Input: [2,2,3,2]
Output: 3
```

**Example 2:**

```
Input: [0,1,0,1,0,1,99]
Output: 99
```

Algorithm:

If a number is added 3 times, the corresponding bit's sum will be 3's multiple
e.g. 3 + 3 + 3 -> 11 + 11 + 11 -> all two bit 1 + 1 + 1 = 3
While the single number will leave its corresponding bit there
e.g. 2 -> 10 -> bit for 1 : sum = 1  using result (| or) to add the number's digit.

The timecomplexity is O(32 * n), 32 is the bit we need to traverse.