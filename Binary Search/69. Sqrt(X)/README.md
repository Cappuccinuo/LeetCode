Time spent :  10 min(Self)

GIVEN: Integer x

RETURNS: the square root of x where *x* is guaranteed to be a non-negative integer.

Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

**Example 1:**

```
Input: 4
Output: 2
```

**Example 2:**

```
Input: 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since 
             the decimal part is truncated, 2 is returned.
```

Algorithm:

As the result is truncated, for some number we cannot find the actual square root. So what we can do is find the last num, that makes num * num <= x. The only thing we need to pay attention to is 

1. we cannot make end as x/2, corner case is when x = 1.
2. all start, end, mid should be long type, otherwise for x = Integer.MAX, the result will be itself, as x / 2 * x / 2 = Integer.MAX at that time.