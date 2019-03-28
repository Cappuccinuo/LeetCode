Time spent :  10 min(See hint)

GIVEN: two integers representing the numerator and denominator of a fraction

RETURNS: the fraction in string format

EXAMPLES:

**Example 1:**

```
Input: numerator = 1, denominator = 2
Output: "0.5"
```

**Example 2:**

```
Input: numerator = 2, denominator = 1
Output: "2"
```

**Example 3:**

```
Input: numerator = 2, denominator = 3
Output: "0.(6)"
```

Algorithm:

How to detect the decimal is recurring? Using hashmap to store the decimal part, and its corresponding '(' insert position