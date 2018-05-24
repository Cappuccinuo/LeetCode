Time spent : 25 min(See a little hint)

GIVEN: a total of n coins that we want to form in a staircase shape

RETURNS: the total number of full staircase rows that can be formed

EXAMPLES:

**Example 1:**

```
n = 5

The coins can form the following rows:
¤
¤ ¤
¤ ¤

Because the 3rd row is incomplete, we return 2.
```

**Example 2:**

```
n = 8

The coins can form the following rows:
¤
¤ ¤
¤ ¤ ¤
¤ ¤

Because the 4th row is incomplete, we return 3.
```

 

DESIGN STRATEGY: Binary Search



All the number should be cast to long first, then cast to int, otherwise the number will not be accurate