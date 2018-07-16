Time spent : 30 min(see hint)

GIVEN: a function rand 7 which generates a uniform random integer in the range 1 to 7

RETURNS: a function rand 10 which generates a uniform random integer 1 to 10.

EXAMPLES:

**Example 1:**

```
Input: 1
Output: [7]
```

**Example 2:**

```
Input: 2
Output: [8,4]
```

**Example 3:**

```
Input: 3
Output: [8,1,10]
```

Algorithm:

For number n, we first generate a number evenly distributed from 0 - 48.

If n >= 40, the 9 digits we can not use, as we can't seperate them to 10 numbers.

So we need to run the calculation again and again, until it is smaller than 40, so we can get the remaining by n % 10(0 - 9) + 1, which is uniformly distributed from 1 to 10.