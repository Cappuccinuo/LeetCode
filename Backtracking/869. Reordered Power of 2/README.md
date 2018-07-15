Time spent :  30 min(Self)

GIVEN: A positive integer N

RETURNS: true iff we can reorder the digits in any order (including the original order) such that the leading digit is not zero, such that the resulting number is a power of 2.

EXAMPLES:

**Example 1:**

```
Input: 1
Output: true
```

**Example 2:**

```
Input: 10
Output: false
```

**Example 3:**

```
Input: 16
Output: true
```

**Example 4:**

```
Input: 24
Output: false
```

**Example 5:**

```
Input: 46
Output: true
```

Algorithm:

Backtracking:

Generate all possible permutations, while put the permutation in list, we check if current permutation already meet the requirement, so that no TLE.



Bit Manipulation:

Count function will return int array of all digits.

Count the digit number in an integer array, for example, 112456, [0, 2, 1, 0, 1, 1, 1, 0, 0, 0].

Compare the array with count(1 << i). i in 0 - 31