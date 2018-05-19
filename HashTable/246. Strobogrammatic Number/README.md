Time spent : 15min(self)

GIVEN: a number string

RETURNS:  true if the number is strobogrammatic

Note: A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).

**Example 1:**

```
Input:  "69"
Output: true
```

**Example 2:**

```
Input:  "88"
Output: true
```

**Example 3:**

```
Input:  "962"
Output: false
```



1. Use HashMap to store the strobogrammatic digits 0, 1, 6, 8, 9 and their corresponding strobogrammatic digits 0, 1, 9, 8, 6.
2. Reverse the string and replace every digit to their strobogrammatic digits. If the digit is not in the map, return false.