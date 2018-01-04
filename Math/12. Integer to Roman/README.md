Time spent : 10 min (See hint)

GIVEN: an Integer

RETURNS: Roman string

EXAMPLES:

Input: 

```
45
```

Output: "XLV"

DESIGN STRATEGY: 

Cause the roman representation of 900, 400, 40,… is different, in other condition, is just append. So we list all the possible combination component and corresponding number.

Go through the numArr, while (num >= numArr[i]), we keep add the strArr[i] to the result, and substract numArr[i] from num. 