Time spent : 15 min

Solution : Double Integer -> Double

GIVEN: a double and an Integer

RETURNS: implement pow(x, n), return pow(double, integer)

EXAMPLES:

Input: 

```
4.000000 5
```

Output: 1024.00000

Input: 

```
2.000000 -2147483648
```

Output: 0

Input: 

```
1.000000 -2147483648
```

Output: 1

DESIGN STRATEGY: General recursion

Note: 

1. When n is 0, return 1; when x is 0, return 0
2. When n is smaller than 0, there is one extreme condition, the Integer.MIN_VALUE, need to add 1 to it, so change it to finite. Than if x < 0, need to change the +/-. In other case n < 0, just need to change the negate n, and change x to its reciprocal.
3. When n is even, pow(x * x, n / 2)
4. When n is odd, x * pow(x * x, n / 2)
