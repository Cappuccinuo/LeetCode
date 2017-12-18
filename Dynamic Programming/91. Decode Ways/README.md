Time spent : 20 min(See Other's solution)

Solution : Memorization + Dynamic Programming

GIVEN: a String

RETURNS: total number of ways to decode it

Note:

```
'A' -> 1
'B' -> 2
...
'Z' -> 26
```

EXAMPLES:

```
Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
```

Design strategy: Bottom-up DP

2 1 9 4 5 1 0

int[] dp = new int[s.length() + 1]

in this problem, we should notice that there's situation when s = "10", if we scan the string from head to tail, we need to remember the previous digit.

But if we scan the string from tail to head, when we came across the '0', we just continue the next loop.

So the basic thought is:

dp[s.length()] = 1

dp[s.length() - 1] = 0(if the digit is '0') or 1(if not '0')

i from s.length() - 2 to 0

if s.charAt(i) == '0', continue

else

​	we check the Integer.parseInt(substring (i, i+2)), two digits, if <= 26, then dp[i] = dp[i + 1] + dp[i + 2]

​	otherwise dp[i] = dp[i + 1]