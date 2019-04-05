Time spent :  15 min(See hint)

GIVEN: Given an array `A` of `0`s and `1`s, consider `N_i`: the i-th subarray from `A[0]` to `A[i]` interpreted as a binary number (from most-significant-bit to least-significant-bit.)

RETURNS: Return a list of booleans `answer`, where `answer[i]` is `true` if and only if `N_i` is divisible by 5.

EXAMPLES:

**Example 1:**

```
Input: [0,1,1]
Output: [true,false,false]
Explanation: 
The input numbers in binary are 0, 01, 011; which are 0, 1, and 3 in base-10.  Only the first number is divisible by 5, so answer[0] is true.
```

**Example 2:**

```
Input: [1,1,1]
Output: [false,false,false]
```

**Example 3:**

```
Input: [0,1,1,1,1,1]
Output: [true,false,false,false,true,false]
```

**Example 4:**

```
Input: [1,1,1,0,1]
Output: [false,false,false,false,false]
```

Algorithm:

The trick part is that A.length can be 30000, which means the value of number will quickly overflow 2 ^ 32. So every time we need to update N and modulo it by 5, so that we will not overflow.