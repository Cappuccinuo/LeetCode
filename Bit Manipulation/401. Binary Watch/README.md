Time spent : 10 min(See hint)

GIVEN: a non-negative integer n

RETURNS: all possible times the watch could represent

EXAMPLES:

```
Input: n = 1
Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
```

![Binary Clock](https://upload.wikimedia.org/wikipedia/commons/8/8b/Binary_clock_samui_moon.jpg)

The given num is actually the bitcount. 

For h (0, 11) m (0, 59), we can count the bit number of h * 2^5 + m, if count is the given number, add that to the result.

Two methods:

Integer.bitCount(int i)

String.format(String format, Object…args)