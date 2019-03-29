Time spent :  10 min(See hint)

GIVEN: a range [m, n] where 0 <= m <= n <= 2147483647

RETURNS: the bitwise AND of all numbers in this range, inclusive.

EXAMPLES:

**Example 1:**

```
Input: [5,7]
Output: 4
```

**Example 2:**

```
Input: [0,1]
Output: 0
```

Algorithm: 

consider a range here xyzpacdrst all are digits in base 2.

```
[m = 0bxyz0acd, n=0bxyz1rst]
```

We can find two numbers that are special in the range [m, n]

```
(1) m' = 0bxyz0111
(2) n' = 0bxyz1000
```

The bitwise AND of all the numbers in range [m, n] is just the bitwise AND of the two special number

```
rangeBitwiseAnd(m, n) = m' & n' = 0bxyz0000
```

This tells us, the bitwise and of the range is keeping the common bits of m and n from left to right until the first bit that they are different, padding zeros for the rest.

Ref: https://leetcode.com/problems/bitwise-and-of-numbers-range/discuss/56719/JavaPython-easy-solution-with-explanation