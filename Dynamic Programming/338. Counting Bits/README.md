Time spent : 10 min(self)

GIVEN: a non negative integer number num

RETURNS: for every numbers i in the range 0 <= i <= num calculate the numbers of 1's in their binary representation and return them as an array

EXAMPLES:

Input: 

```
5
```

Output: `[0,1,1,2,1,2]`.

1. For every number n, its 1's number equals to countBit(n & (n -1)) + 1.
2. In countBit, if ((num & mask) != 0), must operate num & mask first, so need to use () to cover them.
