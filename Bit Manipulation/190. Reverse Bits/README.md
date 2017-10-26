Time spent : 10 min

Solution : Integer -> Integer	

GIVEN: a Integer

RETURNS: reverse bits of an integer.

EXAMPLES:

Input: 

```
43261596((represented in binary as 00000010100101000001111010011100)
```

Output: 964176192(represented in binary as **00111001011110000010100101000000**)

DESIGN STRATEGY: Transcribe formula

Note:

<<    =>     num*2        >>      =>       num/2

1. long result = 0, long type is for not exceed 32 bits.
2. original is 2^0 * 0 + 2^1 * 0 + 2^2 * 1 + ….   The reverse version is 2^31 * 0 + 2^30 * 0 + 2^29 * 1 + ...
3. (n & 1) is get the unit number of n. So every time after calculate the Math.pow, need to >> the n.
