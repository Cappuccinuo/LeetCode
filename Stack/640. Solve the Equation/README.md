Time spent :  20 min(Self)

GIVEN: Equation 

RETURNS: return the value of x in the form of string "x = #value"

Note: The equation contains only '+', '-' operation, the variable `x` and its coefficient.

If there is no solution for the equation, return "No solution".

If there are infinite solutions for the equation, return "Infinite solutions".

If there is exactly one solution for the equation, we ensure that the value of `x` is an integer.

EXAMPLES:

**Example 1:**

```
Input: "x+5-3+x=6+x-2"
Output: "x=2"
```



**Example 2:**

```
Input: "x=x"
Output: "Infinite solutions"
```



**Example 3:**

```
Input: "2x=x"
Output: "x=0"
```



**Example 4:**

```
Input: "2x+3x-6x=x+2"
Output: "x=-1"
```



**Example 5:**

```
Input: "x=x+2"
Output: "No solution"
```

Algorithm:

Using two stack, one for coefficient, one for nums

2x+3x-6x=x+2 => 2x + 3x - 6x - x = 2 => [2,3,-6,-1] [2] => [-2] [2] => -1