Time spent : 15 min(see hint)

GIVEN: a positive integer n

RETURNS: minimum number of replacements needed for n to become 1

Operations:

1. If *n* is even, replace *n* with `*n*/2`.

2. If *n* is odd, you can replace *n* with either `*n* + 1` or `*n* - 1`.

   

**Example 1:**

```
Input:
8

Output:
3

Explanation:
8 -> 4 -> 2 -> 1
```

**Example 2:**

```
Input:
7

Output:
4

Explanation:
7 -> 8 -> 4 -> 2 -> 1
or
7 -> 6 -> 3 -> 2 -> 1
```



For the Integer.MAX, we need to deal with it seperately, it will return 32. Or we can use >>>, which does "/2" operation for unassigned int. If the number is even, just bit move right. If current number is 3, then make temp 2. If (temp - 1) / 2 == 0, then temp —, otherwise temp ++.