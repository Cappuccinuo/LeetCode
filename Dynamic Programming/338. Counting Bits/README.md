Time spent : 10 min(self)

GIVEN: a non negative integer number num

RETURNS: for every numbers i in the range 0 <= i <= num calculate the numbers of 1's in their binary representation and return them as an array

EXAMPLES:

Input: 

```
5
```

Output: `[0,1,1,2,1,2]`.



For n = 5

0000, 0001, 0010, 0011, 0100, 0101

We can reduce the computation by finding the pattern, if we eliminate the last bit of 0101, the number is 010. we can know the bits of 010 first, and add the last bit of 0101, that is i % 2.

dp[i] = dp[i >> 1] + i % 2