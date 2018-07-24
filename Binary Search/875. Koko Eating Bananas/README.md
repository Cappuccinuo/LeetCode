Time spent :  10 min(see little hint)

GIVEN: N piles of bananas, and H hours the guard will be back

RETURNS: the minimum integer `K` such that she can eat all the bananas within `H` hours.

EXAMPLES:

**Example 1:**

```
Input: piles = [3,6,7,11], H = 8
Output: 4
```

**Example 2:**

```
Input: piles = [30,11,23,4,20], H = 5
Output: 30
```

**Example 3:**

```
Input: piles = [30,11,23,4,20], H = 6
Output: 23
```

 

Algorithm:

Using binary search to find the best K between 1 and 1000000000