Time spent : 20 min(See others' thought)

GIVEN: an integer n

RETURNS: all combinations of well-formed parentheses

EXAMPLES:

Input: 

```
3
```

Output: 

```
[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
```



DESIGN STRATEGY: 

1. Use recursion. Need four parameters, current combination, number of "(", number of ")", the limit length of combination (2 * n). 
2. If the current length is limitLen, then add it to result
3. If the number of "(" is less than n, then generate(current + "(",  start + 1, end, limitLen)
4. If the number of ")" is less than the number of "(", then generate(current + ")", start, end + 1, limitLen)