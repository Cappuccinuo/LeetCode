Time spent : 30 min(Take a look at the formula of others)

GIVEN: a String and numRows

RETURNS: the zigzag pattern of the given string

EXAMPLES:

Input: 

```
"PAYPALISHIRING", 3
```

Output: "PAHNAPLSIIGYIR"

```
P   A   H   N
A P L S I I G
Y   I   R
```

DESIGN STRATEGY: Transcribe Formula



1. **When the strLen <= numRows or numRows is 1, we can just return s.** This failed twice cause of memory problem.
2. The main column, that means columns will repeat : index distance between elements is 2 * rowNums - 2. eg: H and N, 8 and 12, the distance is 2 * 3 - 2.
3. The individual elements on the diagonal, has the distance of 2 * rowNums - 2 - 2 * i. i is the current row of that element. eg: S and L, the distance is 2 * 3 - 2 - 2 * 1 = 2.
4. **During the calculation, let the index in the scope of strLen.**
