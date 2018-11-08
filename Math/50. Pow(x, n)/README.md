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

Using the idea of fast power.

We can represent n as binary, b31, b30,..., b0,  we know that sum(bi * 2^i) = n. for the ith bit, if bi == 1, it means we need to multiply the result by x^2^i.

For example, 10's binary representation is 1010, so 2 ^ 10 should be 2^2^3 * 2^2^1 = 1024.

Since the number of bi is at most O(log(n)), we can get all x^2^i in O(log(n)) time.