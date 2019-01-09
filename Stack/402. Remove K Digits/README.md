Time spent :  20 min(See hint)

GIVEN: a non-negative integer num represented as a string

RETURNS:  remove *k* digits from the number so that the new number is the smallest possible.

EXAMPLES:

**Example 1:**

```
Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
```

**Example 2:**

```
Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
```

**Example 3:**

```
Input: num = "10", k = 2
Output: "0"
Explanation: Remove all the digits from the number and it is left with nothing which is 0.
```

Algorithm:

Traverse from index 0 of the number, if str(i) < str(i - 1), we eliminate the digit at str(i - 1) - pop from stack. 

We need to pay attention to "1111", so we need to check if k > 0, we pop from the stack.

At last, we use a stringbuilder to append all the digit.