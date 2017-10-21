Time spent : 5 min

Solution : Integer -> Integer	

GIVEN: a Integer

RETURNS: the number of trailing zeroes in n!

EXAMPLES:

Input: 

```
5
```

Output: 1

Input: 

```
25
```

Output: 6

DESIGN STRATEGY: Transcribe formula



1. When n == 0, return 0, that is, zeroNum
2. All that matters is the 5 in the n!, cause 2 is more than 5. 2*5 decides the 0 numbers. The job is to calculate the 5 numbers in n!. Some integer has many 5, like 25(5* * 5), 125(5 * 5 * 5), so while(n > 0), n = n / 5, add n to zeroNum
