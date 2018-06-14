Time spent : 20 min(see hint)

GIVEN: a string of digits

RETURNS: any Fibonacci like sequence split from S, or return [] if it cannot be done.

Formally, a Fibonacci-like sequence is a list `F` of non-negative integers such that:

- `0 <= F[i] <= 2^31 - 1`, (that is, each integer fits a 32-bit signed integer type);
- `F.length >= 3`;
- and` F[i] + F[i+1] = F[i+2] `for all `0 <= i < F.length - 2`.

 

**Example 1:**

```
Input: "123456579"
Output: [123,456,579]
```

**Example 2:**

```
Input: "11235813"
Output: [1,1,2,3,5,8,13]
```

**Example 3:**

```
Input: "112358130"
Output: []
Explanation: The task is impossible.
```

**Example 4:**

```
Input: "0123"
Output: []
Explanation: Leading zeroes are not allowed, so "01", "2", "3" is not valid.
```

**Example 5:**

```
Input: "1101111"
Output: [110, 1, 111]
Explanation: The output [11, 0, 11, 11] would also be accepted.[Algorithm][https://leetcode.com/problems/global-and-local-inversions/solution/]:
```



Use backtracking, in the helper function, we give the origin string, the result list and current index.

If current index becomes the string's length, and the result list has length larger than 3, return true. 

Otherwise go through the string from idx to the last.

If the first character is '0' and i is larger than idx, break the loop and return false.

Parse the string from idx to i as long, if that num is larger than Integer.MAX_VALUE, break the loop and return false.

If result has at least two numbers, if current num is larger than their sum, break and return false.

If result has no more than two numbers or num is equal to previous two nums sum, result add the num, if helper(S, result, i + 1) returns true, return true. Otherwise remove this num from result.

