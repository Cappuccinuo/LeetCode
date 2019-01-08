Time spent : 15 min(See hint)

GIVEN: two non-negative integers x and y, an integer bound

RETURNS: Return a list of all *powerful* integers that have value less than or equal to `bound`.

Note:  an integer is *powerful* if it is equal to `x^i + y^j` for some integers `i >= 0` and `j >= 0`

- `1 <= x <= 100`
- `1 <= y <= 100`
- `0 <= bound <= 10^6`

EXAMPLES:

**Example 1:**

```
Input: x = 2, y = 3, bound = 10
Output: [2,3,4,5,7,9,10]
Explanation: 
2 = 2^0 + 3^0
3 = 2^1 + 3^0
4 = 2^0 + 3^1
5 = 2^1 + 3^1
7 = 2^2 + 3^1
9 = 2^3 + 3^0
10 = 2^0 + 3^2
```

**Example 2:**

```
Input: x = 3, y = 5, bound = 15
Output: [2,4,6,8,10,14]
```

Algorithm:

Brute Force. Need to know the bound of i and j. As (2^3)^6 is approximately 10^6， so the max is 3*6 which is 18.