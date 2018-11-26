Time spent :  5 min(Self)

GIVEN: a String S of '(' and ')' parentheses.

RETURNS: The minimum number of parentheses we must add to make the resulting string valid

EXAMPLES:

**Example 1:**

```
Input: "())"
Output: 1
```

**Example 2:**

```
Input: "((("
Output: 3
```

**Example 3:**

```
Input: "()"
Output: 0
```

**Example 4:**

```
Input: "()))(("
Output: 4
```

Algorithm:

Reverse thought, we first get the valid parentheses, and the minimum add must be origin String's length() - valid's length().

E1: "()"   E2: ""   E3: "()"  E4: "()"