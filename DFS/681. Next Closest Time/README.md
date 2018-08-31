Time spent :  20 min(See hint)

GIVEN: A time represented in the format "HH:MM"

RETURNS: The next closest time by reusing the current digits

EXAMPLES: 

**Example 1:**

```
Input: "19:34"
Output: "19:39"
Explanation: The next closest time choosing from digits 1, 9, 3, 4, is 19:39, which occurs 5 minutes later.  It is not 19:33, because this occurs 23 hours and 59 minutes later.
```



**Example 2:**

```
Input: "23:59"
Output: "22:22"
Explanation: The next closest time choosing from digits 2, 3, 5, 9, is 22:22. It may be assumed that the returned time is next day's time since it is smaller than the input time numerically.
```

Algorithm:

There are at most 4 * 4 * 4 * 4 = 256 kinds of combinations. We use DFS to traverse all the possible combinations.