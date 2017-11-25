Time spent : 10 min(self)

Solution : Integer -> String

GIVEN: an Integer

RETURNS: its base 7 string representation.

EXAMPLES:

Input: 

```
100
```

Output: "202"

Input: 

```
-7
```

Output:"-10"

DESIGN STRATEGY: Transcribe formula

Record if the num is negative, use stringbuilder to append num % 7, every time num = num / 7.

At last, reverse the stringbuilder and tostring().