Time spent : 5 min

Solution : Integer -> Integer	

GIVEN: a Integer

RETURNS: reverse digits of an integer. When the reversed integer overflows, return 0.

EXAMPLES:

Input: 

```
123
```

Output: 321

Input: 

```
-123
```

Output: -321

Input: 

```
1534236469
```

Output: 0

DESIGN STRATEGY: Transcribe formula

Note: 

Integer.MAX_VALUE : 0x7FFFFFFF (2^31 - 1)

Integer.MIN_VALUE: 0x800000000 (-2^31)

1. long result = 0, long type is for compare, only larger range can compare Integer.MAX_VALUE&MIN_VALUE
2. The unit of integer will become the first of reverse unit. So result = result * 10 + x % 10
3. While x != 0, every time x / 10.
