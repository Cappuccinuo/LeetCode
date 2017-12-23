Time spent : 10 min(See hint)

GIVEN: a non-negative integer n

RETURNS: all possible times the watch could represent

EXAMPLES:

```
Input: n = 1
Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
```

![Binary Clock](https://upload.wikimedia.org/wikipedia/commons/8/8b/Binary_clock_samui_moon.jpg)

Use Backtracking.

Use two arrays to store the possible hours and minutes.

Write a helper function, which takes num, current hour, current minute, Time List, current count, current index.

If current count is num, add current time that consists of hour and minute.

Otherwise go through i = index to hours.length + minutes.length

min is when i < 6, hour is when 6 <= i < 10

if min >= 60, - minutes[i], if hour >= 12, -hours[i - 6]

go to next count and index