Time spent : 10 min

GIVEN: a integer represents the version number

RETURNS: the first bad version use API bool isBadVersion(version)

EXAMPLES:

Input: 

```
10 (8 is the first bad version)
```

Output: 8

DESIGN STRATEGY: Binary Search



1. lo and hi. While (lo < hi), mid = lo + (hi - lo) / 2
2. If the mid is not bad version, lo = mid + 1
3. Else hi = mid
4. At last, the lo one will be the first bad version.
