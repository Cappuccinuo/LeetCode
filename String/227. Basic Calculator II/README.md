Time spent :  15 min(See little hint)

GIVEN: A string	

RETURNS: the value of the expression string

Note: The expression string contains only **non-negative** integers, `+`, `-`, `*`, `/` operators and empty spaces ``. The integer division should truncate toward zero.

EXAMPLES:

**Example 1:**

```
Input: "3+2*2"
Output: 7
```

**Example 2:**

```
Input: " 3/2 "
Output: 1
```

**Example 3:**

```
Input: " 3+5 / 2 "
Output: 5
```

Algorithm:

Using Stack. Keep val of sign and current num.

Two situation: 1. current char is digit, update num 2. not digit and not space, or i is the last index, if sign is '-', push -num, '+' push num, '*' push stack.pop() * num, '/' push stack.pop() / num. Sign update to current char, num update to 0. 

At last add all values in stack.