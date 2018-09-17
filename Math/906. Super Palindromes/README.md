Time spent :  30 min(During contest, didn't work out), 15 min(See hint)

Note: A positive integer is a *superpalindrome* if it is a palindrome, and it is also the square of a palindrome.

GIVEN: Two positive integers L and R(representing as strings)

RETURNS: the number of superpalindromes in the inclusive range [L, R]

EXAMPLES:

```
Input: L = "4", R = "1000"
Output: 4
Explanation: 4, 9, 121, and 484 are superpalindromes.
Note that 676 is not a superpalindrome: 26 * 26 = 676, but 26 is not a palindrome.
```

Algorithm:

Say P = $R^{2}$ is a superpalindrome.

As R is a palindrome, so the first half of R has two possibilities. We can iterate through the first half which has k digits.

If k = 1234, then R = 1234321 or R = 12344321. Each possibility has either odd or even digits in R.

We can specific our root, which is maximum $root = 10^{\frac{1}{4}*18}$. As the superpalindrome num cannot exceed $10^{18}$ For 1 $\leq$ k $\leq$ root, we create two kinds of palindrome, one is odd palindrome which append the second half part from 3(in 1234 example), so the result is 1234321, and the other one is even palindrome.

After we get the palindrome, we check if it is a palindrome and less than R. 