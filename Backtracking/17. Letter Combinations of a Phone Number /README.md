Time spent : 20 min(See others' thought)

GIVEN: a digit String 

RETURNS: all possible letter combinations that the number could represent

EXAMPLES:

Input: 

```
Digit string "23"
```

Output: 

```
["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
```



DESIGN STRATEGY: 

1. Use recursion. Need three parameters, current letter combinations, digits, current completeDigits. For every number in the digits, we can get the letters map. And for each letter in letters, we add the letter to the current letter combinations.
2. When the completeDigits is equal to the digits' length, we can add the current combinations to the result list.