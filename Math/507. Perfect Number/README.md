Time spent : 10 min(See hint)

GIVEN: an integer n

RETURNS: true if it is a perfect number

**Example:**

```
Input: 28
Output: True
Explanation: 28 = 1 + 2 + 4 + 7 + 14
```



1. Instead of iterating through all the numbers to find out the factor of the number, we can reduce the problem to sqrt(num). Suppose the factor of the number is n1, n2 …, since the number is divisible by n1, it can be divided by num / n1. Pay attention when sqrt(num) is also its factor. At last, we need to substract num from the sum and compare it with the number. (As number will count when factor is 1)

 