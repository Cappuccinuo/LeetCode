Time spent :  20 min(see hint)

GIVEN: an array w of positive integers, where w[i] describes the weight of index i

RETURNS: a function pickIndex which randomly picks an index in proportion to its weight

EXAMPLES:

**Example 1:**

```
Input: 
["Solution","pickIndex"]
[[[1]],[]]
Output: [null,0]
```

**Example 2:**

```
Input: 
["Solution","pickIndex","pickIndex","pickIndex","pickIndex","pickIndex"]
[[[1,3]],[],[],[],[],[]]
Output: [null,0,1,1,1,0]
```

Algorithm:

Compute the prefix sum array p

Generate a random integer target in the range [0, weight sum)

Use binary search to find the index x where x is the lowest index such that target < p[x]