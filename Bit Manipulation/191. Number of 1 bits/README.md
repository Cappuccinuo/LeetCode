Time spent : 10 min

Solution : Integer -> Integer	

GIVEN: a Integer

RETURNS: number of bits that is 1

EXAMPLES:

Input: 

```
11((represented in binary as 00000000000000000000000000001011)
```

Output: 3

DESIGN STRATEGY: Loop and flip

The solution is straight-forward. We check each of the 32 bits of the number. If the bit is 1, we add one to the number of 1-bits.

We can check the ith bit of a number using a *bit mask*. We start with a mask m=1, then do m << 1