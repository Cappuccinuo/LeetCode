Time spent :  20 min(See hint)

GIVEN: a list of sorted integers from 1 to n

Note: Starting from left to right, remove the first number and every other number afterward until you reach the end of the list.

Repeat the previous step again, but this time from right to left, remove the right most number and every other number from the remaining numbers.

RETURNS: Find the last number that remains starting with a list of length *n*.

EXAMPLES:

```
Input:
n = 9,
1 2 3 4 5 6 7 8 9
2 4 6 8
2 6
6

Output:
6
```

Algorithm:

We try different combination. For 1 - 8, if we eliminate from back, we first eliminate 8 6 4 2, then eliminate 1 5, then eliminate 7, we get 3 finally. But if we eliminate from left, we get 6 instead. Different order's result 's sum is n + 1, here 3 + 6 = n + 1.

So our recursion formula is f(n) = 2 * (n / 2 + 1 - f(n / 2)). Why we multiply by 2 ? Cause we can see that 8, 6, 4, 2 is 2 * (4, 3, 2, 1). So by n / 2 + 1 - f(n / 2) we can get the reversed result.