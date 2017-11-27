Time spent : 10 min

Solution : Integer -> Boolean	

GIVEN: an Integer

RETURNS: True iff the number is power of 4

EXAMPLES:

Input: 

```
16
```

Output: true

Input: 

```
5
```

Output: false

DESIGN STRATEGY: Integer.bitCount()



If the number >= 0, and there are only 1 bit in the number's binary representation, and the 0 after 1 is even.