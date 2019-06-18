Time spent :  5 min(See hint)

GIVEN: For strings `S` and `T`, we say "`T` divides `S`" if and only if `S = T + ... + T`  (`T` concatenated with itself 1 or more times)

RETURNS: Return the largest string `X` such that `X` divides str1 and `X` divides str2.

EXAMPLES: 

**Example 1:**

```
Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
```

**Example 2:**

```
Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
```

**Example 3:**

```
Input: str1 = "LEET", str2 = "CODE"
Output: ""
```

Algorithm:

Using the idea of find GCD of two integers. We continuously find the substring of the longer one, see if we can find the GCD.