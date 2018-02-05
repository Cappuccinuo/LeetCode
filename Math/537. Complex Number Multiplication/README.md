Time spent : 5 min (see hint)

GIVEN: two strings represented as complex numbers

RETURNS: a string representing their multiplication

EXAMPLES:

```
Input: "1+1i", "1+1i"
Output: "0+2i"
Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.
```

```
Input: "1+-1i", "1+-1i"
Output: "0+-2i"
Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
```

First split the string apart based on regex, so we can get the real number, and complex number. `"\\+|i"`

Then use the formula to solve the problem.

