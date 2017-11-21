Time spent : 10 min(Self completed)

Solution : Self evident

GIVEN: right and left bound

RETURNS: self dividing number as a list

EXAMPLES:

Input: 

```
left = 1, right = 22
```

Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]



DESIGN STRATEGY: Math

Note: 

1. Write a method called isSelfDividingNumber(int x)
2. temp = 0, original = x
3. while x != 0, temp = x % 10, if temp == 0, false, if original % temp != 0, false
4. x = x / 10



Other's judge rule

`for (char c : String.valueOf(x).toCharArray()) {`

​	`if (c == '0' || (x % (c - '0') > 0))`

​		`return false;}`