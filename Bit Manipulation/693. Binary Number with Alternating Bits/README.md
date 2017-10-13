Time spent : 5 min

Solution : n -> boolean

GIVEN: a positive integer n

RETURNS: whether it has alternating bits : if two adjacent bits will always have different values.

EXAMPLES:

Input: 5     (101)

Output: True

Input: 7     (111)

Output: False

DESIGN STRATEGY: Use observer template of String



1. First use Integer.toBinaryString(n) to transfer n to binary number

2. Do && operation on isAlternate and if the current value is different from next value.
