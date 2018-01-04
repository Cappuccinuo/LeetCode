Time spent : 10 min (Self)

GIVEN: a roman numeral

RETURNS: an integer

EXAMPLES:

Input: 

```
IX
```

Output: 9

DESIGN STRATEGY: 

Use an array to store the integer value corresponding to roman.

Go through the string, if map[s.charAt(i)] >= map[s.charAt(i + 1)], then add map[s.charAt(i)] to result.

Otherwise substract map[s.charAt(i)] from result. At last don't forget to add the last digit.