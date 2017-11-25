Time spent : 20 min

Solution : Integer -> Integer	

GIVEN: a Integer array

RETURNS:  the total Hamming distance between all pairs of the given numbers.

EXAMPLES:

Input: 

```
4, 14, 2
```

Output: 6

```
Explanation: In binary representation, the 4 is 0100, 14 is 1110, and 2 is 0010 (just
showing the four bits relevant in this case). So the answer will be:
HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) = 2 + 2 + 2 = 6.
```

DESIGN STRATEGY: Transcribe formula

1. construct a bitmap, for example, 000000….1, 00000000…10, 32bits in total. Use 1 << i to achieve.
2. if num & bitmap != 0, that means there are bit 1. Traverse the nums, get onebit for the total one bit numbers. So there are nums.length - onebit number that are different. So the total hamming distance now is onebit * (nums.length - onebit)
3. Traverse all the 32 bits, and add the result together.
