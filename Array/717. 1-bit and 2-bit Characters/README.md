Time spent : 10 min(Self)

Solution : String -> Boolean

GIVEN: a String 

RETURNS: whether the last character must be a one-bit character or not. 

Note: The first character can be represented by one bit `0`. The second character can be represented by two bits (`10` or `11`).The given string will always end with a zero.

EXAMPLES:

Input: 

```
bits = [1, 0, 0]
```

Output: True

Input: 

```
bits = [1, 1, 1, 0]
```

Output: False

DESIGN STRATEGY: 

We just need to know whether bits[bits.length - 2] is 0 or 1. 

And if bits[i] is 1, i  = i + 2, if bits[i] is 0, i = i + 1

Check the final i is bits.length - 1 