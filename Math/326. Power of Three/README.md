Time spent : 10 min

Solution : Integer -> Boolean

GIVEN: an Integer

RETURNS: true iff the number is power of 3

EXAMPLES:

Input: 

```
27
```

Output: true

Input: 

```
8
```

Output:false

DESIGN STRATEGY: Integer Limitations

The limitation of integer is 2147483647

The limitation of n that is also a power of three is 

3^⌊log3MaxInt⌋ = 3 ^ 19.56 = 3 ^ 19 = 1162261467

We just need to divide 1162…with n to see if the remainder is 0