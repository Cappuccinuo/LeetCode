Time spent :  10 min(Self)

GIVEN: Secret word and guess word

RETURNS: Bulls and cows.

Note: You write down a number and ask your friend to guess what the number is. Each time your friend makes a guess, you provide a hint that indicates how many digits in said guess match your secret number exactly in both digit and position (called "bulls") and how many digits match the secret number but locate in the wrong position (called "cows"). 

EXAMPLES:

**Example 1:**

```
Input: secret = "1807", guess = "7810"

Output: "1A3B"

Explanation: 1 bull and 3 cows. The bull is 8, the cows are 0, 1 and 7.
```

**Example 2:**

```
Input: secret = "1123", guess = "0111"

Output: "1A1B"

Explanation: The 1st 1 in friend's guess is a bull, the 2nd or 3rd 1 is a cow.
```

Algorithm:

For each position, we can directly get the bull number by comparing how many positions are the same.

For cow number, we store the other different chars in two hash arrays A and B ranging from 0 - 9. For each digit, we add the minimum  A[i] and B[i] to cow.